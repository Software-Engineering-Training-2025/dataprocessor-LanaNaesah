package org.example.dataprocessor;

import java.util.List;

public class StdStrategy implements AnalysisMethodoligy{
    @Override
    public double analyze(List<Integer> list) {
        if (list.isEmpty())
            return Double.NaN;
        double mean = new MeanStrategy().analyze(list);
        double sum = 0.0;
        for (Integer i : list){
            sum+=(i-mean)*(i-mean);

        }


        return Math.sqrt(sum/list.size());
    }
}

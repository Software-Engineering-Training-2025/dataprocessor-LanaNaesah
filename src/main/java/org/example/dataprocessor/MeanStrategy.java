package org.example.dataprocessor;

import java.util.List;

public class MeanStrategy implements AnalysisMethodoligy{
    @Override
    public double analyze(List<Integer> list) {
        double sum = 0.0;
        if (list.isEmpty())
            return Double.NaN;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }
}

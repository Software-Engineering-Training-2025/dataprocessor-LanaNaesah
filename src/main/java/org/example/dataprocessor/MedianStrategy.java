package org.example.dataprocessor;

import java.util.Collections;
import java.util.List;

public class MedianStrategy implements AnalysisMethodoligy{
    @Override
    public double analyze(List<Integer> list) {

        if (list.isEmpty())
            return Double.NaN;
        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 0){
            return (list.get(size / 2)+list.get(size / 2-1))/2;
        }

        return list.get(size / 2);
    }
}

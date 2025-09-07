package org.example.dataprocessor;

import java.util.Collections;
import java.util.List;

public class P90Strategy implements AnalysisMethodoligy {
    @Override
    public double analyze(List<Integer> list) {
        if (list.isEmpty())
            return Double.NaN;
        Collections.sort(list);

        int size = list.size();
        int p90 = (int) Math.ceil(0.9*size)-1;

        return list.get(p90);
    }
}

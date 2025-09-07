package org.example.dataprocessor;

import java.util.List;
import java.util.ArrayList;

public class Remove_Negative implements CleanMethodoligy {
    @Override
    public List<Integer> clean(List<Integer> list) {
        List<Integer> cleaned = new ArrayList<>();
        for (Integer num : list) {
            if (num < 0) {
                continue;
            }
            cleaned.add(num);
        }
        return cleaned;
    }
}
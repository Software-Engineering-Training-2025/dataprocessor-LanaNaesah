package org.example.dataprocessor;
import java.util.List;
import java.util.ArrayList;
public class Replace_Negatives_With_Zero implements CleanMethodoligy{
    public List<Integer> clean(List<Integer> list) {
        List<Integer> cleaned = new ArrayList<>();

        for (Integer num : list) {
            if (num < 0) {
                cleaned.add(0);
            } else {
                cleaned.add(num);
            }
        }

        return cleaned;
    }
}

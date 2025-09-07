package org.example.dataprocessor;

import org.example.dataprocessor.enums.CleaningType;

public class CleanFactory {
    public static CleanMethodoligy create (CleaningType type) {
        if (type==CleaningType.REMOVE_NEGATIVES){
            return new Remove_Negative();
        } else if (type==CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new Replace_Negatives_With_Zero();

        }
        throw new IllegalArgumentException("Invalid CleaningType");
    }
}

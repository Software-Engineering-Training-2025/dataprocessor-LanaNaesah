package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static AnalysisMethodoligy create(AnalysisType type){
        if (type==AnalysisType.MEAN){
            return new MeanStrategy();
        } else if (type==AnalysisType.MEDIAN) {
            return new MedianStrategy();

        } else if (type==AnalysisType.STD_DEV) {
            return new StdStrategy();

        } else if (type==AnalysisType.P90_NEAREST_RANK) {
            return new P90Strategy();

        } else if (type==AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return new Top3FreqStrategy();

        }
        throw new IllegalArgumentException("Invalid AnalysisType");
    }
}

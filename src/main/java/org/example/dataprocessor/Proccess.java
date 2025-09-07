package org.example.dataprocessor;

import java.io.IOException;
import java.util.List;

public class Proccess {
    private CleanMethodoligy Clean;
    private AnalysisMethodoligy Analysis;
    private OutputMethodology Output;
    public Proccess(CleanMethodoligy Clean, AnalysisMethodoligy Analysis, OutputMethodology Output) {
        this.Clean = Clean;
        this.Analysis = Analysis;
        this.Output = Output;
    }
    public double ProccessOut(List<Integer> items) throws IOException {
        List<Integer> CleanList= Clean.clean(items);
        double analysed =Analysis.analyze(CleanList);
        Output.output(analysed);
        return analysed;
    }
}

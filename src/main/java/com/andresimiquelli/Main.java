package com.andresimiquelli;

import com.andresimiquelli.report.ReportGenerator;
import com.andresimiquelli.report.ReportGeneratorConfig;
import com.andresimiquelli.report.ReportGeneratorCreator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = ReportGeneratorCreator.create(
                ReportGeneratorConfig
                        .builder()
                        .useHtml()
                        .useCsv()
                        .usePdf()
        );
        System.out.println(reportGenerator.generate(new HashMap<>(), new HashMap<>()));
    }
}
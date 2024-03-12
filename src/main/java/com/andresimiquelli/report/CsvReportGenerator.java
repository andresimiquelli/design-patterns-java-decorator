package com.andresimiquelli.report;

import java.util.Map;

public class CsvReportGenerator extends ReportGeneratorWrapper {

    public CsvReportGenerator(ReportGenerator wrapper) {
        super(wrapper);
    }

    @Override
    public Map<String, String> generate(Map<String, String> data, Map<String, String> result) {
        result.put("csv", createCsvFile());
        return super.generate(data, result);
    }

    private String createCsvFile() {
        return "csv_file.csv";
    }
}

package com.andresimiquelli.report;

import java.util.Map;

public class BasicReportGenerator implements ReportGenerator {
    @Override
    public Map<String, String> generate(Map<String, String> data, Map<String, String> result) {
        result.put("text", createTextFile());
        return result;
    }

    private String createTextFile() {
        return "text_file.txt";
    }
}

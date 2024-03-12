package com.andresimiquelli.report;

import java.util.Map;

public class HtmlReportGenerator extends ReportGeneratorWrapper {

    public HtmlReportGenerator(ReportGenerator wrapper) {
        super(wrapper);
    }

    @Override
    public Map<String, String> generate(Map<String, String> data, Map<String, String> result) {
        result.put("html", createHtmlFile());
        return super.generate(data, result);
    }

    private String createHtmlFile() {
        return "html_file.html";
    }
}

package com.andresimiquelli.report;

import java.util.Map;

public class PdfReportGenerator extends ReportGeneratorWrapper {
    public PdfReportGenerator(ReportGenerator wrapper) {
        super(wrapper);
    }

    @Override
    public Map<String, String> generate(Map<String, String> data, Map<String, String> result) {
        result.put("pdf", createPdfFile());
        return super.generate(data, result);
    }

    private String createPdfFile() {
        return "pdf_file.pdf";
    }
}

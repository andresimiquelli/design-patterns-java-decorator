package com.andresimiquelli.report;

public class ReportGeneratorCreator {
    public static ReportGenerator create(ReportGeneratorConfig config) {
        ReportGenerator result = new BasicReportGenerator();
        if (config.isUseHtml()) {
            result = new HtmlReportGenerator(result);
        }
        if (config.isUseCsv()) {
            result = new CsvReportGenerator(result);
        }
        if (config.isUsePdf()) {
            result = new PdfReportGenerator(result);
        }
        return result;
    }
}

package com.andresimiquelli.report;

public class ReportGeneratorConfig {
    private boolean useHtml;
    private boolean useCsv;
    private boolean usePdf;

    public static ReportGeneratorConfig builder() {
        return new ReportGeneratorConfig();
    }

    public ReportGeneratorConfig useHtml() {
        this.useHtml = true;
        return this;
    }

    public ReportGeneratorConfig useCsv() {
        this.useCsv = true;
        return this;
    }

    public ReportGeneratorConfig usePdf() {
        this.usePdf = true;
        return this;
    }

    public boolean isUseHtml() {
        return useHtml;
    }

    public boolean isUseCsv() {
        return useCsv;
    }

    public boolean isUsePdf() {
        return usePdf;
    }
}

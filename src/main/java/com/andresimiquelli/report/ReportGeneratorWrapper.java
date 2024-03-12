package com.andresimiquelli.report;

import java.util.Map;

public abstract class ReportGeneratorWrapper implements ReportGenerator {
    private final ReportGenerator wrapper;

    public ReportGeneratorWrapper(ReportGenerator wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public Map<String, String> generate(Map<String, String> data, Map<String, String> result) {
        return wrapper.generate(data, result);
    }
}

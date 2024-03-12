package com.andresimiquelli.report;

import java.util.Map;

public interface ReportGenerator {
    Map<String, String> generate(Map<String, String> data, Map<String, String> result);
}

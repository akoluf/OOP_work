package Seminar6.dip1.model.util;

import Seminar6.dip1.model.ReportItem;

import java.util.List;

public class ConsoleReporter implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

}

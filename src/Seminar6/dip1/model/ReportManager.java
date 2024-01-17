package Seminar6.dip1.model;

import Seminar6.dip1.model.util.PrinterReporter;
import Seminar6.dip1.model.util.Reportable;

import java.util.List;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void output(List<ReportItem> items){
        reportable.output(items);
    }
    
}

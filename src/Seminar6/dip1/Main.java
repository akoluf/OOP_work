package Seminar6.dip1;

import Seminar6.dip1.model.Report;
import Seminar6.dip1.model.ReportManager;
import Seminar6.dip1.model.util.ConsoleReporter;
import Seminar6.dip1.model.util.PrinterReporter;
import Seminar6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager rm = new ReportManager(new ConsoleReporter());
        rm.output(report.getItems());
    }
}

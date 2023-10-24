package org.mogul.behavioral.visitor;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        FixedPriceContract fixedPriceContract = new FixedPriceContract(10000);
        SupportContract supportContract = new SupportContract(12344);
        TimeAndMaterialContract timeAndMaterialContract = new TimeAndMaterialContract(12, 12178);
        TimeAndMaterialContract timeAndMaterialContractNicer = new TimeAndMaterialContract(118, 12178);

        List<ReportElement> projects = List.of(fixedPriceContract, supportContract, timeAndMaterialContract, timeAndMaterialContractNicer);

        MonthlyCostReportVisitor monthlyCostReportVisitor = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyCostReportVisitor = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyCostReportVisitor);
            yearlyCost += project.accept(yearlyCostReportVisitor);
        }

        System.out.println("Monthly cost is this: " + monthlyCost);
        System.out.println("Yearly cost is: " + yearlyCost);

    }
}

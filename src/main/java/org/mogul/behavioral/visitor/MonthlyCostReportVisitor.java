package org.mogul.behavioral.visitor;

public class MonthlyCostReportVisitor implements ReportVisitor<Long>{
    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear/12;
    }

    @Override
    public Long visit(TimeAndMaterialContract contract) {
        return contract.costPerHour*contract.hours;
    }

    @Override
    public Long visit(SupportContract contract) {
        return contract.costPerMonth;
    }
}

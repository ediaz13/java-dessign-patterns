package org.mogul.behavioral.visitor;

public class TimeAndMaterialContract implements ReportElement {
    long costPerHour;
    long hours;

    public TimeAndMaterialContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}

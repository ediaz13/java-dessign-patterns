package org.mogul.behavioral.chainofresponsability;

public class PayloadHandler implements HandlerChain {

    String payload;
    public HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }
    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nPayload: " + payload;
        if (next == null) {
            return outputHeader;
        } else {
            return next.addHandler(outputHeader);
        }

    }
}

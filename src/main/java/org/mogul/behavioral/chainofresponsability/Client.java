package org.mogul.behavioral.chainofresponsability;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler auth = new AuthenticationHandler("12345");
        ContentTypeHandler contentTypeHandler = new ContentTypeHandler("json");
        PayloadHandler payloadHandler = new PayloadHandler("Body: {\"username\" = \"john\"}");

        auth.next = contentTypeHandler;
        contentTypeHandler.next = payloadHandler;

        String withAuthentication = auth.addHandler("Headers With Authentication.");
        System.out.println(withAuthentication);

        System.out.println("");

        String withOutAuthentication = contentTypeHandler.addHandler("Headers Without Authentication.");
        System.out.println(withOutAuthentication);
    }
}

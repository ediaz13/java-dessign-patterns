package org.mogul.structural.bridge;

public class Facebook implements App{

    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        System.out.println();
        os.upload("Facebook is Uplading Data!");
        os.download("www.facebook.com");
        os.display("Facebook is Displaying Data!");
        System.out.println();
    }
}

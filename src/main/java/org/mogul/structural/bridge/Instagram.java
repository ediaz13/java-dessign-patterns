package org.mogul.structural.bridge;

public class Instagram implements App{

    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        System.out.println();
        os.upload("Instagram is Uplading Data!");
        os.download("www.instagram.com");
        os.display("Instagram is Displaying Data!");
        System.out.println();
    }
}

package org.mogul.structural.bridge;

public class IOS  implements PhoneOS{

    @Override
    public void upload(String data) {
        System.out.println("Uploading IOS data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading IOS data from URL: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying IOS data: " + data);
    }
}

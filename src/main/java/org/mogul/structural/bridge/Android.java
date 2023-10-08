package org.mogul.structural.bridge;

public class Android implements PhoneOS{

    @Override
    public void upload(String data) {
        System.out.println("Uploading Android data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading Android data from URL: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying Android data: " + data);
    }
}

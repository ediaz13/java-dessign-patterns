package org.mogul.structural.proxy;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Proxy Image: Displaying: " + fileName);
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("Proxy Image: Logging " +  realImage);
    }
}

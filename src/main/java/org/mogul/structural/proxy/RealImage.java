package org.mogul.structural.proxy;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName) {
        System.out.println("Real Image Loading File:" + fileName );
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Real Image Displaying Image: " + fileName);
    }
}

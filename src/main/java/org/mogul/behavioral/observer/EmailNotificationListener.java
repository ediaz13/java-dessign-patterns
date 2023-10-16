package org.mogul.behavioral.observer;

public class EmailNotificationListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Email Notification Listener: " +  eventType +
            ". Performed on File: " + file);
    }
}

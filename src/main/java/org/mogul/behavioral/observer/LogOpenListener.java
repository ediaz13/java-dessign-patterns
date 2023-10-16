package org.mogul.behavioral.observer;

public class LogOpenListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Log Opener Listener: " +  eventType +
                ". Performed on File: " + file);
    }
}

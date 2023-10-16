package org.mogul.behavioral.observer;

public interface EventListener {
    void notify(String eventType, String file);
}

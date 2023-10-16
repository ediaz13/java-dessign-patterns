package org.mogul.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();

        editor.events.subscribe("open", emailNotificationListener);
        editor.events.subscribe("save", emailNotificationListener);
        editor.events.subscribe("open", logOpenListener);

        editor.openFile("test.jpg");
        editor.saveFile();

        System.out.println();

        editor.events.unsubscribe("save", emailNotificationListener);

        editor.openFile("test1.jpg");
        editor.saveFile();

        System.out.println();

        editor.events.notify("open", "test2.jpg");

    }
}

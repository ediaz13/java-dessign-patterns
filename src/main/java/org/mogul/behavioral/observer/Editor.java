package org.mogul.behavioral.observer;

public class Editor {
    public EventManager events = new EventManager("open", "save");

    String file = "";
    void openFile(String fileName) {
        this.file = file;
        events.notify("open", fileName);
    }

    void saveFile() {
        if (file != "") {
            events.notify("save", file);
        }
    }
}

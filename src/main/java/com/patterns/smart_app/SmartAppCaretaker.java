package com.patterns.smart_app;

import java.util.*;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<SmartAppMemento>();

    public void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Save version: " + smartAppMemento.getVersion() + " is on index: " + (mementos.size() -1));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Loaded version: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }

}

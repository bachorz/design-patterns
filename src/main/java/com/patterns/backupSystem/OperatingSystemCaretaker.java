package com.patterns.backupSystem;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento){
        this.operatingSystemMemento = operatingSystemMemento;
        System.out.println("Zapisano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }

}

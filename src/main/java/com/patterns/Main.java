package com.patterns;

import com.patterns.backupSystem.OperatingSystem;
import com.patterns.backupSystem.OperatingSystemCaretaker;
import com.patterns.smart_app.SmartApp;
import com.patterns.smart_app.SmartAppCaretaker;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);
        smartApp.changeVersion(1.3);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.load(smartAppCaretaker.getMemento(0));


        smartApp.changeVersion(1.4);
        smartApp.changeVersion(2.0);
        smartAppCaretaker.addMemento(smartApp.save());
        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCaretaker.getMemento(1));

//        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
//        OperatingSystem operatingSystem = new OperatingSystem();
//        operatingSystem.createBackup();
//        Thread.sleep(3000);
//        operatingSystem.createBackup();
//        Thread.sleep(3000);
//        operatingSystemCaretaker.addMemento(operatingSystem.save());
//        operatingSystem.createBackup();
//        Thread.sleep(3000);
//        operatingSystem.createBackup();
//        Thread.sleep(3000);
//        operatingSystem.load(operatingSystemCaretaker.getMemento());
//        operatingSystem.createBackup();
//        Thread.sleep(3000);
//        operatingSystemCaretaker.addMemento(operatingSystem.save());
//        operatingSystem.load(operatingSystemCaretaker.getMemento());

    }
}

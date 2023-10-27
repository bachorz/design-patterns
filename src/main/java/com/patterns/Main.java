package com.patterns;

import com.patterns.chain_of_responsibility.officer.message.Message;
import com.patterns.chain_of_responsibility.officer.*;
import com.patterns.chain_of_responsibility.preparingChristmas.*;

public class Main {

    public static void main(String[] args) {

//        Message message = new Message("Atakować!", 12122, OfficerRank.GENERAL);
//
//        Officer sergeant = new Sergeant();
//        Officer captain = new Captain();
//        Officer general = new General();
//
//        sergeant.setSuperiorOfficer(captain);
//        captain.setSuperiorOfficer(general);
//
//        sergeant.processMessage(message);

        MotherRequest motherRequest = new MotherRequest(Shelf.MEDIUM);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);
    }
}

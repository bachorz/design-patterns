package com.patterns.chain_of_responsibility.officer;

import com.patterns.chain_of_responsibility.officer.message.Message;

public class Captain extends Officer{

    private static final int CODE = 13;
    private static final String NAME = "Kapitan Duda";
    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN) && message.getCode() == CODE){
            System.out.println(NAME + " otrzymał wiadmość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}

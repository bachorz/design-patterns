package com.patterns.chain_of_responsibility.officer;

import com.patterns.chain_of_responsibility.officer.message.Message;

public class General extends Officer{
    private static final int CODE = 15;
    private static final String NAME = "Generał Bambaryła";
    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE){
            System.out.println(NAME + " otrzymał wiadmość: " + message.getContent());
        } else {
            System.out.println("Wrong recepient of message or wrong code");
        }
    }
}

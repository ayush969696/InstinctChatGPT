package com.myandayush.chatbot;

public class Message {
    public static String SENT_BY_ME = "me";
    public static String SENT_By_BOT = "bot";

    String messsage;
    String sendBy;

    public Message(String messsage, String sendBy) {
        this.messsage = messsage;
        this.sendBy = sendBy;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public String getSendBy() {
        return sendBy;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }
}

package com.driver;

import java.util.Date;

class Mail {
    Date date;
    private String senderId;
    String message;

    public Mail(Date date, String senderId, String message) {
        this.date = date;
        this.senderId = senderId;
        this.message = message;
    }
}
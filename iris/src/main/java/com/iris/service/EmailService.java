package com.iris.service;


import com.iris.dto.Mail;

public interface EmailService {

    public void sendCodeByMail(Mail mail);
}

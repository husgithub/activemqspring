package com.hs.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by husong on 2017/10/14.
 */
public class ConsumerMessageListener implements MessageListener {
    public void onMessage(Message message) {
        try {
            TextMessage textMessage = (TextMessage)message;
            System.out.println("textMessage.getText() = " + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

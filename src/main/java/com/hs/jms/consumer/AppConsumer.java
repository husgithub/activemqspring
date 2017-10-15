package com.hs.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by husong on 2017/10/14.
 */
public class AppConsumer {

    public static void main(String[] args) {
        //安抚
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");


    }
}

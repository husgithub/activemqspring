package com.hs.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by husong on 2017/10/14.
 */
public class AppProducer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = applicationContext.getBean(ProducerService.class);
        for (int i=0;i<100;i++){
            producerService.sendMessage("test"+i);
        }
        applicationContext.close();
    }
}

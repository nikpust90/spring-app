package ru.maxima.radio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_2.xml");
        Player player = context.getBean("player", Player.class);
        player.play();


    }
}

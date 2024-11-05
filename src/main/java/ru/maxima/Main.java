package ru.maxima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Кот", 2);
//        Dog dog = new Dog("Шарик", 5);
//        Duck duck = new Duck("Утка", 4);
//        Tiger tiger = new Tiger("Тигр", 10);
//
//        Zoo zoo = new Zoo(cat, dog, tiger, duck);
//        System.out.println(zoo.toString());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Zoo zoo2 = context.getBean("zoo", Zoo.class);

        System.out.println(zoo2.toString());
        //
    }
}

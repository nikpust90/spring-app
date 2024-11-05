package ru.maxima;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
//@ToString(callSuper = true)
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }



}

package ru.maxima;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
}

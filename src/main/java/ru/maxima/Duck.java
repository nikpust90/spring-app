package ru.maxima;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Duck extends Animal {
    public Duck(String name, int age) {
        super(name, age);
    }
}

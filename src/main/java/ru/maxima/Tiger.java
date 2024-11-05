package ru.maxima;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age);
    }
}

package ru.maxima;

import lombok.*;

@Getter
@AllArgsConstructor
public class Zoo {
    public Cat cat;
    public Dog dog;
    public Tiger tiger;
    public Duck duck;

    @Override
    public String toString() {
        String format = String.format("Кот: Имя %s, Возраст%d\nDog: Имя %s, Возраст%d\nTiger: Имя %s, Возраст%d\nDuck: Имя %s, Возраст%d",
                cat.getName(), cat.getAge(), dog.getName(), dog.getAge(), tiger.getName(), tiger.getAge(), duck.getName(), duck.getAge());
        return format;
    }

}

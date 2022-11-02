package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("420 rubles are " + Converter.rubleToEuro(420) + " euro.");
        System.out.println("960 rubles are " + Converter.rubleToDollar(960) + " dollars.");
    }
}

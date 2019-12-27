package com.company;

public class Main {
    public static void main(String[] args) {
        String name = "Алексей";
        double age = generateRandomAge();
        int temp = -2;
        System.out.println("Здраствуйте, Алексей!\nТемператур на улице -2С.\nВаш возраст " + age + " года/лет.");
        walk( age, temp, name);
    }
    // В телеграмме писали написать метод Public static int generateRandomAge(){} но int тут не подходит а как
    //  поменять результат math floor с double на int я не знаю.
    public static double generateRandomAge() {
        return Math.floor(Math.random() * 107);
    }
    public static void walk (double age, int temp, String name) {
        if ((20 > age && (28 > temp && 0 < temp)) || ((20 < age && 45 > age) && (28 > temp && 0 < temp)) || (45 < age && (25 > temp && -10 < temp))){
            System.out.println(name + " можете идти гулять.");
        } else System.out.println(name + " вам нельза гулять.");
        }
    }


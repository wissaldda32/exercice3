package com.pantxi;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 en chiffres romains : " + Romain.convert(1));  // I
        System.out.println("3 en chiffres romains : " + Romain.convert(3));  // III
        System.out.println("4 en chiffres romains : " + Romain.convert(4));  // IV
        System.out.println("10 en chiffres romains : " + Romain.convert(10)); // X
        System.out.println("50 en chiffres romains : " + Romain.convert(50)); // L
    }
}

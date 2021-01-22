package controller;

import java.util.Scanner;

public class Clase2M {
    //ejercicio 1
    public static void ejercicio1(String[] args) {
        System.out.println("Elegir un numero");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    //ejercicio 2

    public static void ejercicio2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int n = scanner.nextInt();
        System.out.println("Numero 2: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            if(i%m == 0) {
                System.out.println(i);
            }
        }
        scanner.close();

    }

    //ejercicio 3

    public static void ejercicio3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegir numero numero enteros");
        int n = scanner.nextInt();

        if (n%2 == 0){
            System.out.println("Es primo");
            return;
        }

        boolean primo = true;
        for(int i = 3; i < n/2; i = i+2){
            if (n%i == 0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        return;


    }

    //ejercicio 4
    public static boolean esPrimo (int numero) {

        if (numero%2 == 0){
            return false;
        }

        boolean primo = true;
        for(int i = 3; i < numero/2; i = i+2){
            if (numero%i == 0){
                primo = false;
                break;
            }
        }

        return primo;

    }

    public static void ejercicio4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = 1; i < numero; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    //ejercicio 5
    public static void ejercicio5(String[] args) {
        int numero = 33;
        String n = String.valueOf(numero);
        System.out.println(n);
    }

}

package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    //ejercicio 1

/*
    public static void main(String[] args) {
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

    public static void main(String[] args) {

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

    public static void main(String[] args) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = 1; i < numero; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }*/

    //ejercicio 5
//    public static void main(String[] args) {
//        int numero = 33;
//        String n = String.valueOf(numero);
//        System.out.println(n[0]);
//    }


    //Ejercisio de la tarde
    //Raxi_Sort
    //Convertir array de numeros a string
    //Agregar 0
    //Crear listas
    //Elegir digito
    //Suvdividir listas
    //Generar nueva lista

    //ejercio por la tarde
/*

    public static int buscarNumeroMasGrande(int array[]){
        int mayor = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static String modificarNumero(int numero, int mayor){
        int cerosAgregar = String.valueOf(mayor).length() - String.valueOf(numero).length();
        String valor = "";
        for(int i = 0; i < cerosAgregar; i++){
            valor += "0";
        }
        valor += String.valueOf(numero);
        return valor;
    }

   public static String[] agregarCeros(int array[]){
        int mayor = buscarNumeroMasGrande(array);
        String nuevaLista[] = new String[array.length];
        for(int i = 0; i < array.length; i++){
            nuevaLista[i] = modificarNumero(array[i],mayor);
        }
        return nuevaLista;
    }

    public static HashMap subDividirLista(String arr[], int pos){
        HashMap<Character, String []> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            char numero = (char)arr[i].charAt(pos);
            if(hm.containsKey(numero)){
                //buscar array actual
                String modArr[] = hm.get(numero);
                //agregar numero en ultima pos
                for (int j = 0; j < modArr.length; j++){
                    if(modArr[j] == null){
                        modArr[j] = arr[i];
                        break;
                    }
                }
                //guardar array con numero agregado
                hm.put(numero, modArr);
            } else {
                String newArr[] = new String[arr.length];
                newArr[0] = arr[i];
                hm.put(numero, newArr);
            }
        }

        return  hm;
    }

    public static String[] armarLista(HashMap hm, int size){
        String lista[] = new String[size];
        int index = 0;
        for (int i = 0; i<10;i++){
            System.out.println(Integer.toString(1) == '1');
            if(hm.containsKey(Integer.toString(1))) {
                String array[] = (String[]) hm.get((char) i);
                System.out.println("hola" +(String[]) hm.get((char) i));
                for (int j=0; j < array.length; j++) {
                    System.out.println(array);
                    if(array[j] != null){
                        lista[index] = array[j];
                        index++;
                    }
                }
            }
        }
        return lista;
    }

    public static String[] rearmarLista(String arr[], int pos){
        HashMap hm = subDividirLista(arr, pos);
        String lista [] = armarLista(hm, arr.length);
        return lista;
    }


    public static void main(String[] args) {
        int iArr[] = {4,28,132,3,61,5};
        String arr[] = agregarCeros(iArr);
        arr = rearmarLista(arr,1);
        for (int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }



*/
}




package controller;

import java.util.HashMap;

public class Clase2T {


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

            if(hm.containsKey((char)(i+'0'))) {
                String array[] = (String[]) hm.get((char)(i+'0'));
                //System.out.println("hola" +(String[]) hm.get((char)(i+'0')));
                for (int j=0; j < array.length; j++) {
                    //System.out.println(array[j]);
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


    public static void Main() {
        int iArr[] = {3, 673, 106, 45, 2,23 };
        String arr[] = agregarCeros(iArr);
        int arrLength = (int)(arr[0].length()-1);
        for (int i = arrLength; i >= 0 ; i--) {
            arr = rearmarLista(arr, i);
        }
        for (int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}

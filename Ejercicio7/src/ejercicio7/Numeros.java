/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

public class Numeros {
    public static String compararNumeros(double a, double b){
        String resp;
        if(a==b){
            resp = "A es igual que B";
        }else if(a>b){
            resp = "A es mayor que B";
        }else{
            resp = "A es menor que B";
        }
        return resp;
    }
}

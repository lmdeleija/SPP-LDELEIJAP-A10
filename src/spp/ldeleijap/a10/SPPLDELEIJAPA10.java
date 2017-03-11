/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ldeleijap.a10;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class SPPLDELEIJAPA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño=solicitaTamaño();
    int [][] a = arreglo ("A", tamaño);
    int [][] b = arreglo ("B", tamaño);
        
        sumadeMatrixes(a,b);
        restadeMatrixes(a,b);
        multiplicacióndeMatrixes(a,b);
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        
        boolean flag;
        int n=0;
        do{
            System.out.println("INGRESA UN NUMERO ENTERO");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("NO ES ENTERO, HAGALO DE NUEVO");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
    }
    public static int solicitaTamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("TAMÑO DEL ARREGLO = ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitaEntero();
        }
        }
        return arreglo;
    }

    
    public static int [][] sumadeMatrixes (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] + b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado; 
    }
    
   
    public static int [][] restadeMatrixes (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] - b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }  
    }
        return resultado; 
    }
   
    public static int [][] multiplicacióndeMatrixes (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Multiplicación: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] * b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado;
    }
    
}

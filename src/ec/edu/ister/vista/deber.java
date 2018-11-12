/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import javax.swing.JOptionPane;
/**
 *
 * @author Usuariopc
 */
public class deber {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,factorial(4));
        JOptionPane.showMessageDialog(null,pares());
        multiplos();
    }
    public static int factorial(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
    }
public static int pares(){
    int x=0;
    int result=0;
    while (x<10){
        x++;
        if (x%2==0){
            result=x;
            JOptionPane.showMessageDialog(null,"los numeoros pares son: "+(result) );
       }
    }
        return result;
}
public static void multiplos(){
    for(int i=0;i<=100;i++){
	if(i % 3 == 0)
            System.out.println(i);			
        }
    }
}
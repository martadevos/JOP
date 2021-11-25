package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char caracter;
        double decimal;
        cadena= JOptionPane.showInputDialog("introduce una frase");//Muestra una cajita para escanear cadena
        entero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un entero"));//Muestra una cajita para pedir un entero
        caracter=JOptionPane.showInputDialog("Introduce un caracter").charAt(0);//Muestra una cajita para pedir un caracter
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Introduce un decimal"));//Muestra una cajita para pedir un decimal
        System.out.println(cadena+entero);
        JOptionPane.showMessageDialog(null, cadena);//Muestra una cajita con el mensaje que se quiera
        JOptionPane.showMessageDialog(null, entero);
        JOptionPane.showMessageDialog(null, caracter);
        JOptionPane.showMessageDialog(null, decimal);
    }
}

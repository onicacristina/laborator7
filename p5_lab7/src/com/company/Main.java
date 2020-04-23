package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Lista lista= new Lista();
        TransformareBaza baza = new TransformareBaza();
        Fisiere fisiere = new Fisiere();
        Vector vector = new Vector();

        char op;
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.printMenu();
            System.out.println();
            System.out.println("Alegeti o optiune: ");
            op= scanner.next().charAt(0);
            op = Character.toUpperCase(op);

            switch(op){
                case 'A' : baza.transformareBaza(); break;
                case 'B' : lista.ordineInversa(); break;
                case 'C' : vector.ordineInversa(); break;
                case 'D' : fisiere.copiereInvers(); break;
                case 'X' : System.out.println("Ati ales sa iesiti din program!"); break;
                default: System.out.println("OPTIUNE ERONATA......Mai incearca!");
            }

        }while(op!='x' && op!='X');

    }

}

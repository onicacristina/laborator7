package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fisiere  {

    public  String v [] = new String[100];
    public int i;
    public int n=0;
    File filein = new File("fisierOriginal.txt");

    public void citire(int i, Scanner scanner) throws IOException
    {
        try
        {

            if(scanner.hasNextLine())
            {
                v[i]=scanner.nextLine();
                //System.out.println(v[i]);
                i++;
                n++;
                citire(i,scanner);
            }
            scanner.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("A aparut o eroare.");
            e.printStackTrace();
        }
    }

    public  void invers(int n,String v[],FileWriter myWriter) throws IOException
    {
        if(n>=0)
        {
            myWriter.write(v[n] +"\n");
            invers(n-1,v,myWriter);
        }

    }
    public void copiereInvers()  throws IOException
    {
        FileWriter myWriter = new FileWriter("fisierCopie.txt");
        Scanner scanner = new Scanner(filein);
        citire(0,scanner);
        invers(n-1,v,myWriter);
        myWriter.close();
        System.out.println("Continutul fisierului <<fisierOriginal.txt>> a fost copiat"+
                             " cu succes in ordine inversa in fisierul <<fisierCopie.txt>> .");
    }

    }

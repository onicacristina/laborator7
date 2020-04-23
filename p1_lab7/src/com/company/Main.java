package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int n;
        int s=0;
        System.out.println("Introduceti numarul de elemente ale vectorului: ");
        n = scanner.nextInt();
        int [] v = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("v["+i+"]= ");
            v[i] = scanner.nextInt();
        }

        suma(v,0,n,0);

        }

        public static void suma(int []v,int i,int n,int s)
        {
            if(i<n)
            {
                s += v[i];
                suma(v,i+1,n,s);
            }
            else
                System.out.println("Suma elementelor vectorului este: " + s);
        }
}

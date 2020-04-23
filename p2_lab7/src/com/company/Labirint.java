package com.company;

public class Labirint {
    public char m[][]=new char[6][6];
    public char aux[][][] = new char[6][6][6];
    public int a,b;
    public int v[] = new int[6];
    public int poz=0;
    public void afisare()
    {
        //int poz =0;
        v[poz]=0;
        for (int i = 0; i <= 5; i++)
        {
            System.out.print("      ");
            for (int j = 0; j <= 5; j++)
            {   System.out.print(m[i][j]);
                aux[poz][i][j]=m[i][j];
                if(m[i][j]=='+')
                    v[poz]++;
            }
            System.out.println();
        }
        System.out.println();
        //v[poz]=nr;
        System.out.println("In acest caz drumul are lungimea "+ v[poz] + "\n");
        poz++;
    }

    public void p(int x, int y)
    {
        if (m[x][y] == ' ')
        {
            m[x][y] = '+';
            a = x/5;
            b = y/5;
            if ((x%5 == 0) || (y%5 == 0))
                afisare();
            else
            {
                p(x + 1, y);
                p(x, y + 1);
                p(x - 1, y);
                p(x, y - 1);
            }
            m[x][y] = ' ';
        }
    }

    public void drumOptim()
    {
        int mini=Integer.MAX_VALUE;
        int pozitia=0;
        for(int i=1;i<poz;i++)
            if(v[i]<mini)
            {
                mini=v[i];
                pozitia=i;
            }
        System.out.println("\nDrumul cel mai scurt are lungimea "+mini+", acesta  fiind vizibil in labirintul: ");
        for (int i = 0; i <= 5; i++)
        {
            System.out.print("        ");
            for (int j = 0; j <= 5; j++)
            { System.out.print(aux[pozitia][i][j]);
            }
            System.out.println();
        }
    }
    public void initializare()
    {
        for (int i = 0; i <= 5; i++)
            for (int j = 0; j <= 5; j++)
                m[i][j] = '*';
        for (int j = 2; j <= 5; j++)
            m[1][j] = ' ';
        m[2][1] = ' ';
        m[2][2] = ' ';
        m[2][4] = ' ';
        m[3][2] = ' ';
        m[3][3] = ' ';
        m[3][4] = ' ';
        m[4][2] = ' ';
        m[5][2] = ' ';
        afisare();
        a = 5/ 2;
        p(a, a);
        drumOptim();
    }
}

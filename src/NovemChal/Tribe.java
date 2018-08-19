/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovemChal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class Tribe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int f,a,b,temp,t=Integer.parseInt(Br.readLine());
        String str;
        char ch;
        for(int x=0;x<t;x++)
        {
            str=Br.readLine();
            f=a=b=temp=0;
            for(int i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                switch (ch) {
                    case 'A':
                        a++;
                        if(f==1)
                        {a+=temp;temp=0;}
                        else
                            temp=0;
                        f=1;
                        break;
                    case 'B':
                        b++;
                        if(f==2)
                        {b+=temp;temp=0;}
                        else
                            temp=0;
                        f=2;
                        break;
                    case '.':
                        temp++;
                        break;
                    default:
                        break;
                }
              } 
            System.out.println(a+" "+b);
            }
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovemChal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Aman Nautiyal
 */
public class Subar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,q,l,r,x,a,b,ar[];
        String str,tokens[];
        str=Br.readLine();
        tokens=str.split("[ ]+");
        n=Integer.parseInt(tokens[0]);
        q=Integer.parseInt(tokens[1]);
        l=Integer.parseInt(tokens[2]);
        r=Integer.parseInt(tokens[3]);
        ar=new int[n+1];
        Arrays.fill(ar, 0);
        for(int y=1;y<=q;y++)
        {
            str=Br.readLine();
            tokens=str.split("[ ]+");
            x=Integer.parseInt(tokens[0]);
            a=Integer.parseInt(tokens[1]);
            b=Integer.parseInt(tokens[2]);
            if(x==1)
            {
              ar[a]=b;
              continue;
            }
            int temp,start=0,stop=0;
            long s=0;
            for(int i=a;i<=b;i++)
            {
                if(start==0 && ar[i]>=l && ar[i]<=r)
                {    start=i;stop=i;}
                else if(ar[i]>r || ar[i]<r)
                {
                    temp=stop-start+1;
                  s+=(((temp)*(temp+1))/2);
                  start=0;stop=0;
                }
            }
            System.out.println(s);
        }
    }
    
}

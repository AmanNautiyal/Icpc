/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Aman Nautiyal
 */
public class Icpc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(Br.readLine());
        int n,ar[];
        String str,tokens[];
        outer: for(int i=0;i<t;i++)
        {
            n=Integer.parseInt(Br.readLine());
            ar=new int[n];
            str=Br.readLine();
            if(n==1)
            {
              System.out.println(str);
              continue outer;
            }
            tokens=str.split(" ");
            for(int x=0;x<n;x++)
            {
              ar[x]=Integer.parseInt(tokens[x]);  
            }
            Arrays.sort(ar);
            if(ar[0]!=ar[1])
                System.out.println(ar[0]);
            else
            {
                for(int x=1;x<n-1;x++)
                {
                    if(ar[x]==ar[x-1] || ar[x]==ar[x+1])
                        continue;
                    System.out.println(ar[x]);
                    continue outer;
                }
                System.out.println(ar[ar.length-1]);
            }
        }
    }
    
}

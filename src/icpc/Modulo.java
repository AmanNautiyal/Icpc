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
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,tempMod,minMod,A[],B[],modsum[],t=Integer.parseInt(Br.readLine());
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
            n=Integer.parseInt(Br.readLine());
            A=new int[n];
            B=new int[n]; 
            str=Br.readLine();
            tokens=str.split("[ ]+");
            for(int i=0;i<n;i++)
                A[i]=Integer.parseInt(tokens[i]);
            str=Br.readLine();
            tokens=str.split("[ ]+");
            int min=0;
            for(int i=0;i<n;i++)
            {
                B[i]=Integer.parseInt(tokens[i]);
                if(i==0||B[i]<min)
                    min=B[i];
            }
            modsum=new int[min];
            Arrays.fill(modsum,0);
            for(int i=0;i<n;i++)
            {
              tempMod=A[i]%B[i];
              for(int j=0;j<min;j++)
              {
               if(tempMod<j)
                   modsum[j]+=(j-tempMod);
               else if(tempMod==j) {
               } else
                   modsum[j]+=(B[i]-tempMod+j);
              }
            }
             minMod=0;
            for(int j=0;j<min;j++)
            {
                if(j==0 || modsum[j]<minMod)
                    minMod=modsum[j];
            }
            System.out.println(minMod);
        }
       
    }
    
}

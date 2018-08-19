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
public class Laptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(Br.readLine());
        int n,ar[]=new int[101];
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
          n=Integer.parseInt(Br.readLine());
          str=Br.readLine();
          if(n==1)
          {
              System.out.println(str);
              continue;
          }
          Arrays.fill(ar, 0);
          
          tokens=str.split("[ ]+");
          for(int i=0;i<n;i++)
          {
              ar[Integer.parseInt(tokens[i])]++;
          }
         // for(int i=0;i<101;i++)
           //   System.out.println(i+"="+ar[i]);
          for(int i=1;i<101;i++)
          {
              if(ar[i]==1)
              {
                  System.out.println(i);
                  break;
              }
          }
        }
    }
    
}

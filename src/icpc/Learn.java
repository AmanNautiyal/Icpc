/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class Learn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,m,y,t=Integer.parseInt(Br.readLine());
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
          str=Br.readLine();
          tokens=str.split("[ ]+");
          n=Integer.parseInt(tokens[0]);
          m=Integer.parseInt(tokens[1]);
          if(n==1)
              System.out.println(0);
          else if(n==2)
              System.out.println(m);
          else
          {
              y=(n-1)+(m-1)*2;
              System.out.println(y);
          }
        }
    }
    
}

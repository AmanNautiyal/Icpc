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
public class Deviation {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,s,t=Integer.parseInt(Br.readLine());
        int stdev;
        double pm;
        float ar1,ar2;
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
            try
            {
            str=Br.readLine();
            tokens=str.split("[ ]+");
            n=Integer.parseInt(tokens[0]);
            s=Integer.parseInt(tokens[1]);
            pm=Math.sqrt((Math.pow(s,2)*n)/2);
            ar1=+(float)pm;
            ar2=(pm==0?0:-(float)pm);
            System.out.print((ar1%1.0==0?String.format("%.0f",ar1):String.format("%s", ar1))+" ");
            for(int i=1;i<n-1;i++)
                System.out.print(0+" ");
            System.out.print((ar2%1.0==0?String.format("%.0f",ar2):String.format("%s", ar2)));
            System.out.println();
            }
            
            catch(Exception e)
            {
                System.out.println(-1);
                Thread b=new Thread();
              
                
            }
        }
    }
    
}

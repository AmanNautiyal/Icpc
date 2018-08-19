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
public class Rating {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int ar[],n,r,t=Integer.parseInt(Br.readLine());
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
            str=Br.readLine();
            tokens=str.split("[ ]+");
            n=Integer.parseInt(tokens[0]);
            r=Integer.parseInt(tokens[1]);
            ar=new int[n];
            str=Br.readLine();
            tokens=str.split("[ ]+");
            int l,h;
            boolean stillValid=true;
            l=h=0;
            for(int i=0;i<n-1;i++)
            {
                ar[i]=Integer.parseInt(tokens[i]);
                if(stillValid)
                {
                    if(ar[i]<r)
                    {
                        if(l==0 || l<ar[i])
                            l=ar[i];
                        else
                            stillValid=false;
                    }
                    else if(ar[i]>r)
                    {
                        if(h==0 || h>ar[i])
                            h=ar[i];
                        else 
                            stillValid=false;
                    }
                }
            }
            System.out.println(stillValid?"YES":"NO");
        }
    }
    
}

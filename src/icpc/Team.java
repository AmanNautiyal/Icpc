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
public class Team {

    /**
     * @param args the command line arguments
     */
    static boolean check(int x[],int y[])
    {
        int temp[]=new int[3];
        for(int i=0;i<3;i++)
            temp[i]=x[i]-y[i];
        if(temp[0]==0 && temp[1]==0 && temp[2]==0)
            return false;
        else if(temp[0]>=0 && temp[1]>=0 && temp[2]>=0)
            return true;
        else if(temp[0]<=0 && temp[1]<=0 && temp[2]<=0)
            return true;
            return false;
        
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,A[],B[],C[],t=Integer.parseInt(Br.readLine());
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
            A=new int[3];
            B=new int[3]; 
            C=new int[3];
            str=Br.readLine();
            tokens=str.split("[ ]+");
            for(int i=0;i<3;i++)
                A[i]=Integer.parseInt(tokens[i]);
            str=Br.readLine();
            tokens=str.split("[ ]+");
            for(int i=0;i<3;i++)
                B[i]=Integer.parseInt(tokens[i]);
            str=Br.readLine();
            tokens=str.split("[ ]+");
            for(int i=0;i<3;i++)
                C[i]=Integer.parseInt(tokens[i]);
            if((!check(A,B))||(!check(B,C))||(!check(A,C)))
                System.out.println("no");
            else
                System.out.println("yes");
                
        }
    }
    
}

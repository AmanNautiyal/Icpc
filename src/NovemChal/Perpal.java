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
public class Perpal {

    /**
     * @param args the command line arguments
     */
    static String generate(int p)
    {
        StringBuilder st=new StringBuilder();
        st.append("a");
        for(int i=0;i<p-2;i++)
            st.append('b');
        if(p==2)
            st.append('b');
        else
            st.append('a');
        return st.toString();
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n,p,t=Integer.parseInt(Br.readLine());
        String str,tokens[];
        for(int x=0;x<t;x++)
        {
            str=Br.readLine();
            tokens=str.split("[ ]+");
            n=Integer.parseInt(tokens[0]);
            p=Integer.parseInt(tokens[1]);
            if(n==1 ||n==2||p==1||p==2)
            {
                System.out.println("impossible");
                continue;
            }
            str=generate(p);
            for(int i=1;i<=(n/p);i++)
                System.out.print(str);
            System.out.println();
        }
    }
    
}

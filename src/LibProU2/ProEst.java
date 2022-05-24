
package LibProU2;

import java.util.Random;
import javax.swing.*;
public class ProEst {
    int n,r;
    public ProEst(){
        this.n=n;
        this.r=r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    
    

    
    public static int sumaVectores(int a[]){
         int total =0;
         
         for (int x=0;x<a.length;x++){
            total+=a[x];
        }
         
         return total;
    }
    
    public static double Promedio(int a,int can){
        double prome=0;
        
        prome=((double)a/(double)can);
        
        
        return prome;
    }
    
    public static int Moda(int a[]){
      int maxRep=0;
      int moda=0;
        
        for(int i=0; i<a.length; i++){
        int f = 0;
        for(int j=0; j<a.length; j++){
            if(a[i]==a[j]){
                f++;
            }   
            if(f>maxRep){
               moda= a[i];
               maxRep= f;
            }   
        }
        
    }        
        return moda;
    }
    
    public static String Ordenar(int num[]){
        String todo="";
        for(int i = 0; i < num.length - 1; i++)
        {
            for(int j = 0; j < num.length - 1; j++)
            {
                if (num[j] < num[j + 1])
                {
                    int tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(int i=0;i < num.length; i++)
        {
           todo+=num[i]+" ";
        }
        
        return todo;
    }
    
    public static String Mediana(String a){
        String med="";
        int pos=0;
        double medd=0.00000000;
        String esp= a.replaceAll("\\s","");
        int tam=esp.length();        
        if(tam%2==0){
            pos=tam/2;
            med=esp.substring((pos-1),(pos+1));
            
            String n1=med.substring(0,1);
            String n2= med.substring(1,2);
            
            int nu1=Integer.parseInt(n1);
            int nu2=Integer.parseInt(n2);
            
            medd=((double)nu1+(double)nu2)/2;
            
            med=String.valueOf(medd);
            
        }else{
            pos=tam/2;
            med=esp.substring(pos,pos+1);
        }
        
        
        return med;
    }
    
    public static int Factorial(int num){
        
        if(num<0){
            return 0;
        }else{
       
        if(num == 0){
            return 1;
        }
        else
            return num * Factorial(num-1);
        

    }
}
    
    
}

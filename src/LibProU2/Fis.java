
package LibProU2;

import static LibProU2.GeoTri.Factorial;


public class Fis {
    
          public static double raiz(double a){
             double x=2.0;
             double res=0;
             
             if(a>=1){
                 do{
                     x=(x+a/x)/2;
                 }while((x*x)/a>1);
                 res=x;
             }else if(a==0) 
                 res=0;
             return res;
         }
          
        public static double Exponente(double a, double b ){
        double tot= a;
        
        if (b!=0){
            for (int i=1; i<b; i++){
                tot*=a;
            }
            return tot;
        } else return 1;
        }
        
            public static double seno(double x){
        double pos=0, neg=0;
        int i=1;
        double res;
        double pot1=1;
        double pot2=3;
        double tot= x * 3.141592654/180;
        
        do{
            pos=pos+(Exponente(tot,pot1))/Factorial((int)pot1);
            pot1+=4;
            neg=neg-(Exponente(tot,pot2))/Factorial((int)pot2);
            pot2+=4;
            i++;
        }while(i<4);
        res=pos+neg;
        return res;
    }
        
    
    public static double tiempoca(double h){
        double res;
        double res1=((2*h)/9.81);
        res=raiz(res1);
        
        return res; 
    }
    
        public static double velFin(double vi, double t){
        double res;
        
        res=(double)vi+(9.81*(double) t);
        
        return res; 
    }
        
        public static double altura(double vi, double t){
        double res;
        
        res=vi+((9.81*Exponente(t,2))/2);
        
        return res; 
    }
        
        //tiro parabolico
       public static double alturapa(double vi, double ang){
        double res;
        
        res=Exponente((vi*seno(ang)),2)/(2*9.81);
        
        return res; 
    }
       
     public static double disFinpa(double vi, double ang){
        double res;
        
        res=(Exponente(vi,2)*seno(2*ang))/9.81;
        
        return res; 
    }  
     
     public static double tiempotp(double vi, double ang){
        double res;
        
        res=2*((vi*seno(ang))/9.81);
        
        return res; 
    }
     

}

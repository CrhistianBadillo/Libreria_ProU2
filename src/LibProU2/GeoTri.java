
package LibProU2;



public class GeoTri {
    
    
    public static double Exponente(double a, double b ){
        double tot= a;
        
        if (b!=0){
            for (int i=1; i<b; i++){
                tot*=a;
            }
            return tot;
        } else return 1;
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
    
        public static double coseno(double x){
        double pos=0, neg=0;
        int i=1;
        double res;
        double pot1=2;
        double pot2=4;
        double tot= x * 3.141592654/180;
        
        do{
            pos=pos-(Exponente(tot,pot1))/Factorial((int)pot1);
            pot1+=4;
            neg=neg+(Exponente(tot,pot2))/Factorial((int)pot2);
            pot2+=4;
            i++;
        }while(i<4);
        res=1+pos+neg;
        return res;
    }
        
        public static double tangente(double x){
            double res=(seno(x)/coseno(x));
            return res;
        }
    
    
        public static double areaCua(int a){
            double area=Exponente((double)a,2);
            return area;
        }
        
        public static double areaRec(int a, int b){
            double area=(double)a*(double)b;
            return area;
        }
        
        public static double areaTri(int a, int b){
            double area=((double)a*(double)b)/2;
            return area;
        }
        
         public static double areaRom(int a, int b){
            double area=((double)a*(double)b)/2;
            return area;
        }
        
         public static double areaPen(int a, int b){
            double pe=((double)a*5);
            double area=(pe*(double)b)/2;
            return area;
        }
        
         public static double areaHex(int a, int b){
            double pe=((double)a*6);
            double area=(pe*(double)b)/2;
            return area;
        } 
         
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
         
         public static double teoPit(int a, int b){
                   double res=0;
                   double suma=Exponente((double)a,2)+Exponente((double)b,2);
                   res=raiz(suma);
                   
                   return res;
        } 
        

    }




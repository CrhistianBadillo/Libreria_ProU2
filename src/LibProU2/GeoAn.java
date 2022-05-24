
package LibProU2;

public class GeoAn {
    

    
    public static double Exponente(double a, double b ){
        double tot= a;
        
        if (b!=0){
            for (int i=1; i<b; i++){
                tot*=a;
            }
            return tot;
        } else return 1;
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
    
    public static double disPuntos(int x1, int y1, int x2, int y2){
        double res;
        
        double r1=(x2-x1);
        double r2=(y2-y1);
        
        double re=(Exponente(r1,2))+(Exponente(r2,2));
        res=raiz(re);
        return res;
        
    }
    
    public static String punMe(int x1, int y1, int x2, int y2){
        double x,y;
        String res;
        
        x=((double)x2+(double)x1)/2;
        y=((double)y2+(double)y1)/2;
        
        String xx=String.valueOf(x);
        String yy=String.valueOf(y);
        
        res=("("+xx+","+yy+")");
        return res;
    }
    
    public static String penRec(int x1, int y1, int x2, int y2){
        
        double m=(((double)y2-(double)y1)/((double)x2-(double)x1));
        String res=String.valueOf(m);
        
        return res;
        
    }
    
    
    public static void main(String[] args) {
        System.out.println(penRec(-4,-3,2,5));
    }
}

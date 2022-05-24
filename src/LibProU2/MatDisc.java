
package LibProU2;

public class MatDisc {
    
    public static String Binario(int a){
        String tbin="";
        int lon;
       
                String bin="",bin1="";
        
         while(a !=0){
                    if (a%2==0){
                        bin+=0;
                    }else{
                        bin+=1;
                    }
                    a/=2;
                }
                lon=bin.length();
                for(int x=lon-1;x>=0;x--){
                    bin1=bin1+bin.charAt(x);
                }
                tbin+=bin1;
        
        return tbin;
    }
    
    public static boolean tablaVer(int p,int q, int op){
        boolean res = false;
        
        if(p==1 & q==1 & op==3){
            res=true;
        }
        
         else if(p==1 & q==0 & op==3){
            res=false;
        }
        
       else if(p==0 & q==1 & op==3){
            res=false;
        }
        
       else if(p==0 & q==0 & op==3){
            res=false;
        }
        
       else if(p==1 & q==1 & op==4){
            res=true;
        } 
        
       else if(p==1 & q==0 & op==4){
            res=true;
        } 
        
       else if(p==0 & q==1 & op==4){
            res=true;
        } 
        
       else if(p==0 & q==0 & op==4){
            res=false;
        } 
        
        
       else  if(p==1 & q==1 & op==5){
            res=true;
        }
        
         else if(p==1 & q==0 & op==5){
            res=false;
        }
        
       else if(p==0 & q==1 & op==5){
            res=true;
        }
        
       else if(p==0 & q==0 & op==5){
            res=true;
        }
        
       else if(p==1 & q==1 & op==6){
            res=true;
        } 
        
       else if(p==1 & q==0 & op==6){
            res=false;
        } 
        
       else if(p==0 & q==1 & op==6){
            res=false;
        } 
        
       else if(p==0 & q==0 & op==6){
            res=true;
        } 
        
        
        return res;
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(Binario(520));
        System.out.println(tablaVer(0,0,4));
    }
}

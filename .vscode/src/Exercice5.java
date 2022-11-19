
public class Exercice5 {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
        
    }
    public static double exp(int base,int n) {
        if(n==0){
            return 1;
        }else if(n>0){
            return base*exp(base,n-1);
        }else{
            n= Math.abs(n);
            double res = base*exp(base,n-1);
            return (1/res);
        }
        
    }
    public static double expBoucle(int base,int n) {
        double res=1;
        if(n>0){
            for(int i=0;i<n;i++){
                res*=base;
            }
        }else if(n<0){
            for(int i=0;i<Math.abs(n);i++){
                res*=base;
        
            }
            res=1/res;
        }
        return res;
    }
    public static int g(int n) {
        if(n<=1){
            return 1;

        }else{
            return 1+g(n-2);
        }
        
    }
    public static double sommeCaree(double n) {
            if(n==0){
             return 0;
            }
            else{ 
            n=Math.abs(n);
            return ((Math.pow(n, 2))+(sommeCaree(n-1)));
            }
    }
    public static double sommeTab(double[] tab,int ind) {
        double res=0;
        if(ind < tab.length){
            res = tab[ind] + sommeTab(tab, ind+1);
        }
        
        return res;
    }
    public static void main(String[] args) {
        double[] tab = {3,2,16};
        System.out.println(sommeTab(tab,0));
    }
}

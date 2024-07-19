public class recursionfibonis {
    public static int fibonis(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = fibonis(n-1);
         int fibnm2 = fibonis(n-2);
         int  fibn = fibnm1 + fibnm2;
         
        return fibn;
    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println(fibonis(n));
    }
    
}
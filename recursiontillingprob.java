public class recursiontillingprob {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int tnm1 = tilingProblem(n-1);
        int tnm2 = tilingProblem(n-2);
        int totalway = tnm1 + tnm2;
        return totalway;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        
    }
    
}

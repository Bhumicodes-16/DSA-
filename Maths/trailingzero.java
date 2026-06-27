public class trailingzero {
    public static void main(String[] args) {
        trailingzero obj = new trailingzero();
        System.out.println(obj.trailingZero(100)); // Output: 24
    }

    public int trailingZero(int n) {
    //    int fact=1;
    //      for(int i=1;i<=n;i++){
    //       fact=fact*i;

    //      }
    //     int res=0;
    //     while(fact%10==0){
    //         res++;
    //         fact=fact/10;
    int res=0;
    for(int i=5;i<=n;i=i*5){
        res=res+n/i;
    }
        return res;
    }
}

 
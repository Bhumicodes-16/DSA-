/* divisors of a number always appear in pair*/

public class Divisors{

    public void printDivisors(int n)
    {
       for (int i = 1; i*i <= n; i++) {
        if(n%i==0){
            System.out.println(i);
            if(i!=n/i){
                System.out.println(n/i);
            }
            

        }
           
       }
    }
    
    public static void main(String[] args) {
        Divisors d = new Divisors();
        d.printDivisors(36);
    }
}


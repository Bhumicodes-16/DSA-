public class Palindrome{
    public static void main(String args[]){
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(12321)); // Output: true
    }

   public boolean isPalindrome(int n)
   {
    int rev=0;
    int temp=n;
    while(temp!=0)
    {
      int ld=temp%10;
      rev=rev*10+ld;
      temp=temp/10;  
    }
    return (rev==n);
   }
    }

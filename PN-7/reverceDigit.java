import java.util.Scanner;

public class reverceDigit {
        static int reverse(int x) {
            int ans = 0;
            if(x > 0){
                while(x > 0){
                    ans= ans*10 + x%10;
                    x = x/10;
                }
                return ans;
            }
            else{
                 x = Math.abs(x);
                while(x > 0){
                    ans= ans*10 + x%10;
                    x = x/10;
                }
                return -1 * ans;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int x = sc.nextInt();
            int ans = reverse(x);
            System.out.println("output :"+ans);
        }
}

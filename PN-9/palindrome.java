// Given an integer x, return true if x is a palindrome, and false otherwise
// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

import java.util.Scanner;

public class palindrome{
    static boolean checkPalindrome(int x){
        int temp = x;
        int ans = 0;
        while(x>0){
            ans = ans*10 + x%10;
            x = x/10;
        }
        if(temp == ans){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        System.out.println(checkPalindrome(number));
    }
}
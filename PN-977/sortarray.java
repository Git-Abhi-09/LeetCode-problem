// Given an integer array nums sorted in non-decreasing order, return an array of the
//  squares of each number sorted in non-decreasing order.

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

import java.util.Scanner;

class sortarray{
    static void printarray(int [] array)
    {
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    static int[] sortArr(int [] array){
        int n = array.length;
        int [] ansarray = new int[n];
        int k = n-1;
        int i = 0 ,j = n-1;
        while (i<=j) {
            if(Math.abs(array[i])>=Math.abs(array[j])){
                ansarray[k--] = array[i] * array[i];
                i++;
            }
            else{
                ansarray[k--] = array[j] * array[j];
                j--;
            }
        }
        return ansarray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of array:");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int [] ans = sortArr(arr);
        System.out.println("Output: ");
        printarray(ans);
    }
}
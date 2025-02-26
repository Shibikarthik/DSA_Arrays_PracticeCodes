import java.util.Scanner;

//solution code
class Solution {

     boolean isEven(int n) {//returns a boolean value

       return n%2==0; // ternary operator in use
    }
}

public class Odd_or_even {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n=new Scanner(System.in).nextInt();
        System.out.println(solution.isEven(n));//prints the boolean value
    }
}

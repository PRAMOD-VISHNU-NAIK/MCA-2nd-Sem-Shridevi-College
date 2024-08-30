// Write a Java program to list the factorial of the numbers 1 to 10. To calculate the factorial value use while loop. (Hint Fact of 4=4*3*2*1).


class Factorial {
    public static void main(String[] args) {

    // Factorial of One Number
    /* 
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    */

        // Factorial of a number from 1 to 10

        for(int i=1; i<=10; i++){
            int num = i;
            int fact = 1;
            for(int j=1; j<=num; j++){
                fact = fact * j;
            }
            System.out.println("Factorial of Number "+ num +"is: "+ fact);
            
        }
    }
}
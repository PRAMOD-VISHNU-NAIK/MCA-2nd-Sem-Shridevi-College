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

        // Factorial of 1 to 10

        for(int i=1; i<=10; i++){
            int num = i;
            int fact = 1;
            for(int j=1; j<=num; j++){
                fact = fact * j;
            }
            System.out.println("Factorial of Number "+num+"is: "+ fact);
            
        }
    }
}
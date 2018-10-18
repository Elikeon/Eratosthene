package eratosthenes;

public class Eratosthenes {

    public static void main(String[] args) {
        boolean numbers[] = new boolean[1000];	
        int i;
        int nextPrime;							

        
        for (i = 0; i < 1000; i++) {
            numbers[i] = true;
        }

     
        nextPrime = 2;
        while (nextPrime <= Math.sqrt(1000)) {
         
            for (i = nextPrime * 2; i < 1000; i += nextPrime) {
                numbers[i] = false;
            }

         
            do {
                nextPrime++;
            } while (numbers[nextPrime] != true);
        }


        int numCounter = 0;
        System.out.println("The prime numbers from 1 - 1000 are:");
        for (i = 2; i < 1000; i++) {

            if (numbers[i] == true) {
                numCounter++;   
                System.out.print(i + " ");
            
                if (numCounter == 10) {
                    System.out.print("\n");
                    numCounter = 0;
                }
            }
        }
    }
}
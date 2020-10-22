package section1;

//This program will determine what numbers between 1 and 100 are prime and print them.

public class PrimeTester {
    public static void main(String[] args) {

        int myNumber = 100;

        for (int i = 1; i <= myNumber; i++) {
            if (isPrime(i) == true){
                System.out.println(i + " is a Prime Number.");
            }
        }
    }

    private static boolean isPrime(int numToCheck) {
        if (numToCheck != 1 && numToCheck % 2 != 0 && numToCheck % 3 != 0 && numToCheck % 5 != 0
                && numToCheck % 7 != 0 && numToCheck % 9 != 0 && numToCheck % 11 != 0) {
            return true; } 
        else if (numToCheck == 2 || numToCheck == 3 || numToCheck == 5 || numToCheck == 7
                || numToCheck == 11) { return true; }
        else return false;
    }
}

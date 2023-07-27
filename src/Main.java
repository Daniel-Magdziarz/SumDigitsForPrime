/*This program takes a number, separates each digit, sums up the total with these digits,
and then it determines if the result is a prime number or not. */
//Author: Daniel Magdziarz

public class Main {

    public static void main(String[] args) {

        int miasNumber = 7907;
        System.out.println("Mia's number: " + miasNumber);
        int summedDigits = sumDigit(miasNumber);
        System.out.println("Mia's result: " + summedDigits);
        boolean isPrime = isPrime(summedDigits);
        if(isPrime){
            System.out.println("Mia chose a set of digits that yielded a prime number of: " + summedDigits);
        } else {
            System.out.println("Mia chose a set of digits that yielded a number that is not prime, but "
            + "\nis equally awesome. Mia's lucky number " + summedDigits + ".");
        }
    }

    public static int sumDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;

        while(number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= (number / 2); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

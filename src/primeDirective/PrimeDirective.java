package primeDirective;

// Import statement:
import java.util.ArrayList;

enum evenOrOdd{
    ODD,
    EVEN
}

public class PrimeDirective {

    // Add your methods here:
    public static boolean isPrime(int number){
        int i = 2;
        if (number == 2) return true;
        else if (number < 2) return false;
        else {
            while (i < number) {
                if (number % i == 0) return false;
                i++;
            }
            return true;
        }
    }

    public static ArrayList onlyEvens(int[] numbers){
        ArrayList<Integer> evens = new ArrayList();
        for (int number : evens){
            if (number % 2 == 0){
                evens.add(number);
            }
        }
        return evens;
    }

    public static ArrayList onlyEvensOrOdds(evenOrOdd evenOrOdd, int[] numbers){
        ArrayList<Integer> nums = new ArrayList();
        if (evenOrOdd == evenOrOdd.EVEN){
            nums = onlyEvens(numbers);
        }
        if (evenOrOdd == evenOrOdd.ODD){
            nums = onlyOdds(numbers);
        }
        return nums;
    }

    public static ArrayList onlyOdds(int[] numbers){
        ArrayList<Integer> odds = new ArrayList();
        for (int number : odds){
            if (number % 2 == 1){
                odds.add(number);
            }
        }
        return odds;
    }

    public static ArrayList onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList();
        for (int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }


    public static void main(String[] args) {
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(onlyPrimes(numbers));

    }

}

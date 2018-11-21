package streamExerciseTwo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamExerciseTwo {
	public static void main(String[] args) {

		List<Integer> listOfNumbers = Arrays.asList(10, 7, 3, 9, 11);
		List<Integer> listOfPrimeNumbers;
		listOfPrimeNumbers = listOfNumbers.stream().filter(Numbers -> isNumberPrime(Numbers)).sorted()
				.collect(Collectors.toList());
		System.out.println(listOfPrimeNumbers);
	}

	public static boolean isNumberPrime(int number) {
		if (number == 1) {
			return false;
		} else {

			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}

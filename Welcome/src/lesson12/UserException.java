package lesson12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

class myException extends Exception {
	myException() {
		System.out.println("Error:Password too short");
	}

	myException(int n) {
		System.out.println("Error:Only adults can join");
	}
}

public class UserException {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			throw new NullPointerException();

		} catch (Exception e) {
		} finally {
			System.out.println("End");
		}
	}
}

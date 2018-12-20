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
			System.out.print("Enter user name : ");
			String n = br.readLine();
			System.out.print("Enter your password : ");
			String m = br.readLine();

			if (m.length() < 6)
				throw new NoSuchElementException();

			if (m.length() < 6)
			//	throw new myException();
			System.out.print("Enterd your age : ");
			int o = Integer.parseInt(br.readLine());
			if (o < 18)
				throw new myException(o);
		} catch (Exception e) {
		} finally {
			System.out.println("End");
		}
	}
}

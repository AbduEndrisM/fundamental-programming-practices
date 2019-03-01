package interview;

/*
Junior Java Developer at Lanyon was asked...	Jun 16, 2015
Write a function to print the first letter of every word in a string*/

//start 3:30  done 3:35
public class JuniorJavaDeveloperLanyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Junior Java Developer at Lanyon was asked";

		String[] stringArray = string.split(" ");
		for (String s : stringArray)
			System.out.println(s.charAt(0));
	}

}

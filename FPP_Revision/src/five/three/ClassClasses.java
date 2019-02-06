package five.three;
/*Reflection is an API which is used to examine or modify 
the behavior of methods, classes, interfaces at runtime.
*/
public class ClassClasses {

	public static void main(String[] args) {

		Abdu a = new Abdu();
		Abdu aa = new Abdu();
		System.out.println(a); 
		System.out.println(aa); 
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getSimpleName()); 
	}

}

  class Abdu{ 
}

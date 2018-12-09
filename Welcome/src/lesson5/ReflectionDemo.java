package lesson5;


 
import java.lang.reflect.*;
import java.util.Arrays;


 class Phonedirectory {
	 private String name;
		private String town;
		public int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	public Phonedirectory(String name, String town,int number) {
		this.name = name;
		this.town = town;
		this.number = number;
		}
	public Phonedirectory(String name,int number) {
		this.name = name;
		this.number = number;
		}
	public Phonedirectory(int number) {
		this.number = number;
		}
	}


public class ReflectionDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException{

		// Obtain the class object if we know the name of the class
		Class obj = Phonedirectory.class;
		
			// get the absolute name of the class
			String objClassPackage = obj.getName();
			System.out.println("Class Name is: " + objClassPackage);

			// get the simple name of the class (without package info)
			String objClassNoPackage = obj.getSimpleName();
			System.out.println("Class Name without package is: "
					+ objClassNoPackage);

			// get the package name of the class
			Package objPackage = obj.getPackage();
			System.out.println("Package Name is: " + objPackage);

			// get all the constructors of the class
			Constructor[] constructors = obj.getConstructors();
			System.out.println("Constructors are: "
					+ Arrays.toString(constructors));

			// get constructor with specific argument
			Constructor constructor = obj.getConstructor(Integer.TYPE);
			Constructor c = obj.getConstructor(String.class,String.class,int.class);
			System.out.println("Specific Constructors are: "
					+ constructor.toString() + c.toString());
			
			// initializing an object of the Phonedirectory class
			Phonedirectory rent = (Phonedirectory) constructor.newInstance(23456789);

			// initializing an object of the Phonedirectory class
			Phonedirectory c1 = (Phonedirectory) c.newInstance("Renuka","Fairfield",1245);
			
			// get all methods of the class including declared methods of
			// superclasses in that case, superclass of Phonedirectory is the class java.lang.Object
			Method[] allmethods = obj.getMethods();
			//System.out.println("Methods are: " + Arrays.toString(allmethods));
			for (Method method : allmethods) {
				System.out.println("method = " + method.getName());
			}

			// get all methods declared in the class but excludes inherited methods.
			Method[] declaredMethods = obj.getDeclaredMethods();
			System.out.println("Declared Methods are: "
					+ Arrays.toString(declaredMethods));
			for (Method dmethod : declaredMethods) {
				System.out.println("method = " + dmethod.getName());
			}
			

			// gets all the public member fields of the class PhoneDirectory
			Field[] fields = obj.getFields();

			System.out.println("Public Fields are: ");
			for (Field oneField : fields) {
				// get public field name
				Field field = obj.getField(oneField.getName());
				System.out.println("oneField.getName() : "  + oneField.getName());
				

				// get public field type
				Object fieldType = oneField.getType();
				System.out.println("Data type of field " + oneField.getName() + " is: "
						+ oneField.getType());

				// get public field value by passing the Object
				Object value = field.get(rent);
				System.out.println("Value of field " + oneField.getName() + " is: "
						+ value);

			}
			 // How to access private member fields of the class
			// getDeclaredField() returns the private field
			Field privateField = Phonedirectory.class.getDeclaredField("name");

			String fname = privateField.getName();
			System.out.println("private Fieldname is: " + fname);
			// makes this private field instance accessible
			// for reflection use only, not normal code
			privateField.setAccessible(true);

			// get the value of this private field
			String fieldValue = (String) privateField.get(c1);
			System.out.println("fieldValue = " + fieldValue);
			
		}
}

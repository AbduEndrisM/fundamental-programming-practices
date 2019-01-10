package generic;

class TestTwoA<T> {

	int x;
	String y;

	TestTwoA(int x) {
		this.x = x;
	} 
	TestTwoA(String y) {
		this.y = y;
	} 

	
	public int getObject() {
		return this.x;
	}
	
	public String getObject2() {
		return this.y;
	}
}


class GenericTwoNo {
	public static void main(String[] args) {
		

		// instance of Integer type
		TestTwoA obj1 = new TestTwoA(15);
		System.out.println(obj1.getObject());

		// instance of String type
		TestTwoA obj2 = new TestTwoA("Abdu Endris");
		System.out.println(obj2.getObject2());
	}
}

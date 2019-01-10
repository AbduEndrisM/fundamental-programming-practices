package generic;

class TestTwoB <T> {

	T x;

	TestTwoB(T x) {
		this.x = x;
	} 

	
	public T getObject() {
		return this.x;
	}
}


class GenericTwoYes {
	public static void main(String[] args) {
		

		// instance of Integer type
		TestTwoB<Integer> obj1 = new TestTwoB<Integer>(15);
		System.out.println(obj1.getObject());

		// instance of String type
		TestTwoB<String> obj2 = new TestTwoB<String>("Abdu Endris");
		System.out.println(obj2.getObject());
	}
}

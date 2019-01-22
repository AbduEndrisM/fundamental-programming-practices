package innerClass.local;

public class Two {
	public int x = 0;

	class FirstLevel {
		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);	 //23
			System.out.println("this.x = " + this.x); //1
			System.out.println("Tow.this.x = " + Two.this.x);	//0
		}
	}

	public static void main(String[] args) {
		Two st = new Two();
		Two.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}

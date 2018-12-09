package lesson7;

//Blue outer class & Black inner class
public class MyClass {
private String s = "hello";
public static void main(String[] args){
new MyClass();
}
MyClass() {
MyInnerClass myInner = new MyInnerClass();
System.out.println(myInner.intval);
myInner.innerMethod();
}
private class MyInnerClass{
private int intval = 3;
private void innerMethod(){
System.out.println(s);
}
}
}
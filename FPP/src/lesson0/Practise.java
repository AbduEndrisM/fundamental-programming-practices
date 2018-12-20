package lesson0;


import java.util.*; 

public class Practise { 
    public static void main(String args[]) 
    { 
        // Creating an empty Vector 
        Vector<String> vec_tor = new Vector<String>(); 
  
        // Use add() method to add elements into the Vector 
        vec_tor.add("Welcome"); 
        vec_tor.add("To"); 
        vec_tor.add("Geeks"); 
        vec_tor.add("4"); 
        vec_tor.add("Geeks"); 
  
        // Displaying the Vector 
      /*  System.out.println("Vector: " + vec_tor);*/ 
  
        // Displaying the capacity of Vector 
     /*  System.out.println("The capacity is: " + vec_tor.capacity());*/ 
    
    ArrayList lt= new ArrayList<>();
    for(int i=0;i<6;i++)
    	lt.add("Element "+i);
    //System.out.println(lt.ensureCapacity(10);
    
    
    Queue <String> queue = new LinkedList<>();
    queue.offer("Java");
    queue.offer("DotNet");
    queue.offer("PHP");
    queue.offer("HTML");
    Iterator i = queue.iterator();
    i.next();
    i.next();
    i.remove();  
    System.out.println(i.next());
    
    } 
} 
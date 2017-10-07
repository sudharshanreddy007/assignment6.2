package hashcode2;


import hashcode.Student; //implementing the hash code using an object

public class StudentDemo {  //here we are creating another class and two objects to print the hash code 

	public static void main(String[] args) {  //of both them
		// TODO Auto-generated method stub
  Student x = new Student(); // here the student objects,one object has x and the other has y
  Student y =new Student();
  
  System.out.println("Hash code =" +x.hashCode());  //here it prints the hashcodes of both of them
  System.out.println("Hash code =" +y.hashCode());
	}

}
package mypack;



interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  


public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
}  






















public class TestInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package assignmentDay2;

class A{
	
}
class B extends A{
	
}
class C{
	
}
public class InstanceofDemo {
    
    public static void main(String[] args) {
        
	A a=new A();
	B b=new B();
	C c=new C();
	A testRef=new B();
	
	System.out.println(a instanceof A);
	
	System.out.println(a instanceof B);
	
	System.out.println(b instanceof A);
	
	System.out.println(testRef instanceof B);
	
    }
}
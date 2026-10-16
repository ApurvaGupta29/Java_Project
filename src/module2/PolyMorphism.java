//package module2;
//
//class B {
//	void screenshot() {
//		System.out.println("It is taking screenshot when the test case is pass");
//	}
//}
//
//public class PolyMorphism extends B {
//	void screenshot() {
//		System.out.println("It is taking screenshot when the test case is failed");
//	}
//
//	public static void main(String[] args) 
//        {
//                if(If they test case is pass)
//                {
//               B b1=new B();
//                        b1.login();
//                //Whether my parent class method will execute, or my child class method will execute, it totally depends at runtime.
//                //Not at compile time
//                }
//                else //if my test case is failed
//                {
//                	PolyMorphism a1=new PolyMorphism();
//                        a1.screenshot();
//                }
//                }
//}

package module2;

class Animal {

	Animal(String name)

	{
		System.out.println("Animal constructor");
	}
}

class Dog extends Animal

{
	Dog()

	{ super("tommy");
		System.out.println("Dog constructor");
	}
}

public class SuperCalling {

	public static void main(String[] args) {
		new Dog();
	}
}

//class Test {
//   int a = 10;
//    public static void main(String[] args) {
//    	Test t1 = new Test();
//        System.out.println(t1.a);
//    }
//}

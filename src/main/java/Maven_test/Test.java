package Maven_test;

public class Test {
	class A{
		int i = 10;
	}
	class B extends A{
		int j = 20;
	}
	class C extends B{
		int k = 30;
	}

	public void pruebaJerarquia() {
//		A a = new B();
//		B b = (B)a;
//		C c = (C)b;
		
		// Mensaje de prueba escrito en repositorio remoto
		
//		You are creating one object of type B. As per your class hierarchy, each B object is also an A, but not a C.
//		Now let's look on how to assign the reference to this B object to various variables:

//		B b = (B)new A(); 
		// texto de prueba en clase Test
		/*
		Object o = new B(); // You can always assign references to an Object-typed variable.
		A a = (A) o; // This works because the object is of type A.
		B b = (B) o; // This works because the object is of type B.
		C c = (C) o; // This does not work because the object is not of type C.
		*/
//		System.out.println(c.k);
		// comentario de prueba
		System.out.println("Texto de prueba");
	}
}

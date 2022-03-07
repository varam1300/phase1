package pack1;

class defaultAccessSpecifier {
	void display() {
		System.out.println("You are using default access specifier");
	}

}


public class AccessSpecifier1 {

	public static void main(String[] args) {
		
		System.out.println("Default Access Specifier");
		defaultAccessSpecifier das=new defaultAccessSpecifier();
		das.display();

	}

}

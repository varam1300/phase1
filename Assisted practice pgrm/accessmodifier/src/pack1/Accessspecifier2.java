package pack1;

class privateAccessSpecifier{
	private void display() {
		System.out.println("Private Access Specifier");
	}
}
public class Accessspecifier2 {

	public static void main(String[] args) {
		System.out.println("You are using Private Access Specifier");
		privateAccessSpecifier pas=new privateAccessSpecifier();
		//trying to access private method of another class 
		//pas.display();

	}

}

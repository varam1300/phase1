package calculater3;

import java.util.Scanner;

public class ArithamaticCalculater3 {
	public static void main (String[] args){
        int A, B, res=0;
        char opara;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number");
        A=reader.nextInt();
        System.out.println("Enter Secound number");
        B=reader.nextInt();
        System.out.println("Enter Operation + or - or * or /");
        opara=reader.next().charAt(0);
        switch (opara){
            case '+': res=A+B;
            break;
            case '-': res=A-B;
            break;
            case '*': res=A*B;
            break;
            case '/': res=A/B;
            break;
            default:System.out.println("Invalid input"); 
        }
        System.out.println("Result is :"+res);
        reader.close();

}

}

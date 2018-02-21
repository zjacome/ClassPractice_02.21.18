import java.util.Scanner;
public class Person_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
		String N=sc.next();
		
	System.out.println("How old are you?");
		int A=sc.nextInt();
		
		Person p1=new Person(N,A);
		
		System.out.print("Are you old enough? "+p1.isAdult());
	}

}

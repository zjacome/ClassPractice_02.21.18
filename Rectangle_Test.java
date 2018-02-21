import java.util.Scanner;
public class Rectangle_Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("How many rectangles are you entering?");
			double rect=in.nextDouble();
			
		for(double x=1;x<=rect;x++) {	
			
		System.out.println("What is the length of your rectangle in cm?");	
			double l=in.nextDouble();
		System.out.println("What is the width of your rectangle in cm?");
			double w=in.nextDouble();
		Rectangle r1=new Rectangle(l,w);
		
		System.out.println("The area is "+r1.Area(l,w)+"cm^2");
		System.out.println("The perimeter is "+r1.Perimeter(l, w)+"cm");
		
		
	}
	}
}

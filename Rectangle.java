
public class Rectangle {
	double L;
	double W;
	
	public Rectangle(double L, double W) {
		this.L=L;
		this.W=W;
			
	}
	public static double Area(double L, double W) {
		double Area=(L*W);
		return Area;
	}
	
	public static double Perimeter(double L, double W) {
		double Perimeter=((2*L)+(2*W));
		return Perimeter;
		
		
	}

}

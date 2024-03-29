import java.lang.Math;
public class Point
{
	private double x;
	private double y;

	public Point(double px, double py){
		this.x = px;
		this.y = py;
	}

	public double getX() { return x; }
	public double getY() { return y; }
	public double getRadius() { 
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
	}
	public double getAngle() {
		if ( x == 0.0 ) {
			if (y == 0.0)
				return 0.0;
			if (y > 0.0)
				return Math.PI / 2;
			if (y < 0.0)
				return -Math.PI / 2 ; 
		}
		return Math.atan( y / x );
	}

	public Point rotate90() {
		double newX = x;
		double newY = y;
		if ((x >= 0 && y >= 0) || (x < 0 && y < 0))
			newX = x * -1;
		else if ((x < 0 && y >= 0) || (x >= 0 && y < 0))
			newY = y * -1;

		return new Point(newY, newX);
	}



}

	

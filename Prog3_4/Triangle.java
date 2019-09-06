package Prog3_4;

public final class Triangle {
	/** base and height variables are defined so that height <= base */
	private final double base;
	private final double height;
	
	
	public Triangle(double base, double height){
			this.base = base;
			this.height = height;
	}

	public double computeArea() {
		return (0.5 * base * height);
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
}


public class Triangulo extends Poligono implements Diagonal {
	public Triangulo(double base, double altura) {
		super(base, altura);
	
	}
	
	@Override
	public double area() {
		return super.area()/2;
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public abstract class Poligono extends Figura {

	private double base;
	private double altura;
	
		
	public Poligono(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}	

	public double area() {
		return getBase()*getAltura();
	}
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

}

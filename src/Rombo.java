public class Rombo implements FiguraGeometrica{
	private String name;
	private double lado;
	private double dmayor;
	private double dmenor;
	public Rombo(String name, double lado, double dmayor, double dmenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.dmayor = dmayor;
		this.dmenor = dmenor;
	}
    public double calcularArea() {
    	return ((this.dmayor * this.dmenor)/2);
    }
	public double calcularPerimetro() {
		return (getLado()*4);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
} 

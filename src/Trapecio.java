
public class Trapecio implements FiguraGeometrica {
	private String nombre;
	private double b;
	private double B;
	private double l,m,n,o;
	private double altura;
	
	public Trapecio(String nombre, double b, double B, double altura, double l,double m,double n,double o) {
		super();
		this.nombre = nombre;
		this.b = b;
		this.B = B;
		this.l = l;
		this.m = m;
		this.n = n;
		this.o = o;
		this.altura = altura;
	}
	@Override
	public String getName() {
		return this.nombre;
	}
	@Override
	public double calcularPerimetro() {
		return (getl()+getm()+getn()+geto());
	}
	@Override
	public double calcularArea() {
			return (getAltura()*(getbase()*getBase()))/2;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getbase() {
		return b;
	}

	public void setbase(double b) {
		this.b = b;
	}
	public double getBase() {
		return B;
	}

	public void setBase(double B) {
		this.B = B;
	}
	public double getl() {
		return l;
	}

	public void setl(double l) {
		this.l = l;
	}
	public double getm() {
		return m;
	}

	public void setm(double m) {
		this.m = m;
	}
	public double getn() {
		return n;
	}

	public void setn(double n) {
		this.n = n;
	}
	public double geto() {
		return o;
	}

	public void seto(double o) {
		this.o = o;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", altura=" + altura + "]";
	}

	
	
}

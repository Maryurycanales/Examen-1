
public class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	
	protected Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
		protected double getBase()
		{
			return base;
		}
		protected double setBase(double base)
		{
			return this.base=base;
		}
		protected double getAltura()
		{
			return altura;
		}
		protected double setAltura(double altura)
		{
			return this.altura = altura;
		}
		protected double getArea()
		{
			return altura*base;
		}


}
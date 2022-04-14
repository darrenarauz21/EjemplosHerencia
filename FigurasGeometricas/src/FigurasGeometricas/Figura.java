package FigurasGeometricas;

public abstract class Figura {
	
	protected double valor1;
	protected String colorRelleno;
	protected String colorLinea;
	
	public Figura(double valor1, String colorLinea, String colorRelleno) {
		this.valor1 = valor1;
		this.colorLinea = colorLinea;
		this.colorRelleno = colorRelleno;
		}
	public double getValor1() {
		return valor1;
		}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
		}
	public String getColorLinea() {
		return colorLinea;
	}
	public void setColorLinea(String colorLinea) {
		this.colorLinea = colorLinea;
	}
	
	public String getColorRelleno() {
		return colorRelleno;
	}
	public void setColorRelleno(String colorRelleno) {
		this.colorRelleno = colorRelleno;
	}
}

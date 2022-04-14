package FigurasGeometricas;

public class Circulo extends Figura{
	
	public Circulo(double valor1,String colorLinea, String colorRelleno) {
		super(valor1, colorLinea, colorRelleno);
		}

	public double getArea() {
		return Math.PI*Math.pow(this.valor1,2);
		}
	
	public double getPerimetro() {
		return Math.PI*this.valor1;
		}
	
	public void MostrarCirculo(){
		
		System.out.println("Area: "+getArea());
		System.out.println("Perimetro: "+getPerimetro());
	}

}

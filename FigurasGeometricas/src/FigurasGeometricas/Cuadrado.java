package FigurasGeometricas;

public class Cuadrado extends Figura {

	public Cuadrado(double valor1,String colorLinea, String colorRelleno) {
		super(valor1, colorLinea, colorRelleno);
		}	
	
	public double getArea() {
		return Math.pow(this.valor1,2);
		}
	
	public double getPerimetro() {
		return this.valor1*4;
	}
	
	public void MostrarCuadrado(){
		
		System.out.println("Area: "+getArea());
		System.out.println("Perimetro: "+getPerimetro());
	}
}

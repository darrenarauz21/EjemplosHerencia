package FigurasGeometricas;

public class Principal {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(5,"Negro", "Azul");
		Cuadrado cuadrado = new Cuadrado(5,"Negro", "Azul");
		Triangulo triangulo = new Triangulo(5,2,"Negro", "Azul");
		
		System.out.println("Circulo");
		circulo.MostrarCirculo();
		System.out.println();
		System.out.println("Cuadrado");
		cuadrado.MostrarCuadrado();
		System.out.println();
		System.out.println("Triangulo");
		triangulo.MostrarTriangulo();

	}

}

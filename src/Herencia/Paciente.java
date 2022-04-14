package Herencia;

public class Paciente extends Persona {

	private int numero;

	public Paciente(String nombre, String apellido, int edad, int numero) {
		super(nombre, apellido, edad);
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void mostrarPaciente() {
		System.out.println("Nombre del Paciente: " + getNombre());
		System.out.println("Apellido del Paciente: "+ getApellido());
		System.out.println("Edad del Paciente: " + getEdad());
		System.out.println("Número de Paciente:" + getNumero());
	}
	
	
}

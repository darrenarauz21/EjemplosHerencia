package Herencia;

public class Doctor extends Persona {

	private String especialidad;

	public Doctor(String nombre, String apellido, int edad, String especialidad) {
		super(nombre, apellido, edad);
		this.especialidad = especialidad;
	}
		
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void mostrarDoctor() {
		System.out.println("Nombre del Doctor: " + getNombre());
		System.out.println("Apellido del Doctor: "+ getApellido());
		System.out.println("Edad del Doctor: " + getEdad());
		System.out.println("Especialidad:" + getEspecialidad());
	}
	
}

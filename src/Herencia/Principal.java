package Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("Andy", "Gomez", 53, 134);
		
		paciente.mostrarPaciente();
		
		System.out.print("\n");
		
		paciente.setNombre("Andr�s");
		
		paciente.mostrarPaciente();
		
		System.out.print("\n");
		
		Doctor doctor1 = new Doctor("Juan", "M�ndez", 45, "Medicina General");
		
		doctor1.mostrarDoctor();
		
	}

}

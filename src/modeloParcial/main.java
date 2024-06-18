package modeloParcial;

public class main {

	public static void main(String[] args) {
		
		administrativos empleado1 = new administrativos("Juan", 100000, 6, 1);
		operativos empleado2 = new operativos("Valen", 200000, 5, 1);
		
		empleado1.mostrarEstado();
		empleado2.mostrarEstado();
		

	}

}

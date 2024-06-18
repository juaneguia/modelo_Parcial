package modeloParcial;

public class administrativos extends empleados {
	
	private int oficina;

	public administrativos(String nombre, double salario, int antiguedad, int oficina) {
		super(nombre, salario, antiguedad);
		this.oficina = oficina;
	}

	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}
	
	public double calcularBonificacion() {
		double total;
		if (antiguedad<6) {
			total = salario * 0.1;
		}
		else {
			total=salario*0.15;
		}
		return total;
        
	}
	
	public void mostrarEstado() {
		System.out.println("Emplado: " + nombre + ", salario: " + salario + " Bonificación: " + calcularBonificacion());
		
	}

}

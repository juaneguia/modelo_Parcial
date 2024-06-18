package modeloParcial;

public class operativos extends empleados{
	
	private int galpon;

	public operativos(String nombre, double salario, int antiguedad, int galpon) {
		super(nombre, salario, antiguedad);
		this.galpon = galpon;
	}

	public int getGalpon() {
		return galpon;
	}

	public void setGalpon(int galpon) {
		this.galpon = galpon;
	}
	
	public double calcularBonificacion() {
		double total;
		if (antiguedad<6) {
			total = salario * 0.15;
		}
		else {
			total=salario*0.20;
		}
		return total;
        
	}
	
	public void mostrarEstado() {
		System.out.println("Emplado: " + nombre + ", salario: " + salario + " Bonificación: " + calcularBonificacion());
		
	}

}

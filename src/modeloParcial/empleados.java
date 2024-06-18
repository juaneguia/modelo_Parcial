package modeloParcial;

public class empleados {
	
	protected String nombre;
	protected double salario;
	protected int antiguedad;
	
	public empleados(String nombre, double salario, int antiguedad) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "empleados [nombre=" + nombre + ", salario=" + salario + ", antiguedad=" + antiguedad + "]";
	}	

}

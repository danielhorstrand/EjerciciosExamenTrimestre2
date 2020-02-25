
public abstract class Empleado {

	public String nombre;
	public String apellido;
	public String nif;
	public int edad;
	public boolean casado;
	public double salario;
	
	public Empleado(String nombre, String apellido, String nif, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nif = nif;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public void Clasificacion(){
		if (this.edad<=21){
			System.out.println("Principiante");
		}else {
			if (this.edad>=22 && this.edad<=35){
				System.out.println("Intermedio");
			}else {
				System.out.println("Senior");
			}
		}
	
	}
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", edad=" + edad + ", casado="
				+ casado + ", salario=" + salario + "]";
	}
	public double Aumento(int porcentaje){
		this.salario+=(this.salario*porcentaje)/100;
		return this.salario;
	}
}

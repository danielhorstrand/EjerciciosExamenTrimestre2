import java.util.ArrayList;

public class Programador extends Empleado{

	protected int lineasDeCodigoPorHora;
	ArrayList<String> lenguajesProgramacion = new ArrayList<String>();
	
	public Programador(String nombre, String apellido, String nif, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, ArrayList<String> lenguajesProgramacion) {
		super(nombre, apellido, nif, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		lenguajesProgramacion = new ArrayList<String>();
	}

	public Programador(String nombre, String apellido, String nif, int edad, boolean casado, double salario) {
		super(nombre, apellido, nif, edad, casado, salario);

	}

	public void AddLenguaje (String lenguaje){
		this.lenguajesProgramacion.add(lenguaje);
		
	}

	public String toString() {
		return "Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajesProgramacion="
				+ lenguajesProgramacion + ", nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", edad="
				+ edad + ", casado=" + casado + ", salario=" + salario + "]";
	}

	
}

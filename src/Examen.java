
public class Examen {

	private String nombreAsignatura;
	private String aula;
	private Fecha fecha;
	private Hora hora;
	
	
	public Examen(String nombreAsignatura, String aula) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
	}

	public Examen(String nombreAsignatura, String aula, Fecha fecha, Hora hora) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
		this.fecha = fecha;
		this.hora = hora;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public void cambiodeFecha2(Fecha fecha){
		
	}
	public void cambiodeFecha(int dia,int mes,int año){
		
		if (año==2020){
			if (mes==4 || mes==6 || mes==9 || mes== 11){
				this.fecha = new Fecha (dia,mes,año);
				System.out.println("Fecha cambiada correctamente."+this.nombreAsignatura);
			}
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
				this.fecha = new Fecha (dia,mes,año);
				System.out.println("Fecha cambiada correctamente."+this.nombreAsignatura);
			}
		}else {
				System.out.println("ERROR EN LA FECHA."+this.nombreAsignatura);

		}

	}
	public void cambiodeHora(int horas,int minutos){
		if ((horas>=9 || horas<=14) && (minutos>=0 || minutos<=60)){
			System.out.println("Hora cambiada correctamente."+this.nombreAsignatura);
			this.hora= new Hora (horas,minutos);
		}else {
			System.out.println("ERROR EN LA HORA."+this.nombreAsignatura);
		}
	}
	public String toString() {
		return "Examen [nombreAsignatura=" + nombreAsignatura + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora
				+ "]";
	}
	
	
	
}

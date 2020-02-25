
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha fecha1 = new Fecha (5,3,2020);
		Hora hora1 = new Hora (11,40);
		Examen programacion = new Examen ("Programacion","2",fecha1,hora1);
		
		Fecha fecha2 = new Fecha (6,3,2020);
		Hora hora2 = new Hora (12,10);
		Examen BBDD = new Examen ("BBDD","2",fecha2,hora2);
		
		Fecha fecha3 = new Fecha (9,3,2020);
		Hora hora3 = new Hora (13,0);
		Examen Entornos = new Examen ("Entornos De desarrollo","2",fecha3,hora3);
		
		Fecha fecha4 = new Fecha (10,3,2020);
		Hora hora4 = new Hora (12,10);
		Examen Lenguajes = new Examen ("Lenguaje de Marcas","2",fecha4,hora4);
		
		Fecha fecha5 = new Fecha (11,3,2020);
		Hora hora5 = new Hora (13,0);
		Examen Sistemas = new Examen ("Sistemas Informaticos","2",fecha5,hora5);
		
		Fecha fecha6 = new Fecha (6,3,2020);
		Hora hora6 = new Hora (10,0);
		Examen FOL = new Examen ("Formacion y Orientacion Laboral","2");
		
		programacion.cambiodeHora(10,30);
		BBDD.cambiodeFecha(5,3,2020);
		
		if ((programacion.getFecha().equals(BBDD.getFecha())==true)||(programacion.getFecha()==Entornos.getFecha())||(programacion.getFecha()==Lenguajes.getFecha())||(programacion.getFecha()==Sistemas.getFecha())){
			System.out.println("Error, hay que cambiar la fecha a Programacion.");
		}else {
			if ((BBDD.getFecha()==programacion.getFecha())){
				System.out.println("Error, hay que cambiar la fecha a BBDD.");
			}else {
				if ((Entornos.getFecha()==Lenguajes.getFecha())||(Entornos.getFecha()==Sistemas.getFecha())){
					System.out.println("Error, hay que cambiar la fecha a Entornos.");
				}else {
					if ((Lenguajes.getFecha()==Sistemas.getFecha())){
						System.out.println("Error, hay que cambiar la fecha a lenguajes.");
					}
				}
			}
		}
		
		System.out.println(BBDD.toString());
		System.out.println(programacion.toString());
		System.out.println(BBDD.getFecha());
		
		
		
		
	}

}

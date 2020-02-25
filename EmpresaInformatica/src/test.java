import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
	
		Programador alberto = new Programador("Alberto","Sierra","767861476h",24,true,1.400);
		Programador daniel = new Programador("Daniel","Horstrand","57462823j",27,false,2.000);
		Programador jochema = new Programador("Jose","Maria","892378578s",18,true,1.400);

		
		alberto.AddLenguaje("java");
		daniel.AddLenguaje("Java");
		jochema.AddLenguaje("JavaScript");
		
		System.out.println(alberto.toString());
		System.out.println(daniel.toString());
		System.out.println(jochema.toString());
		
		
	}

}

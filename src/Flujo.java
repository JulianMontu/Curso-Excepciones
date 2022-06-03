import java.util.Iterator;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (MiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}

	public static void metodo1() throws MiException {
		System.out.println("Inicio metodo 1");
		
		metodo2();
		System.out.println("Fin metodo 1");
	}

	public static void metodo2() throws MiException {
		System.out.println("Inicio metodo 2");
		throw new MiException("Mi Excepsion fue lanzada");
		
	}
}

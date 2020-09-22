package mainClass;

import java.util.ArrayList;
import java.util.Scanner;

import productos.Articulos;
import productos.Pantalones;
import productos.Polera;
import productos.Zapatos;



public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zapatos zapato1 = new Zapatos(25000, "3003", 34, "Mega", "Mega CZ50");
		Zapatos zapato2 = new Zapatos(25000, "3004", 40, "Mega", "Mega CX50");
		Pantalones pantalon1 = new Pantalones(15000, "1000", 30, "Variant", "Varian Caqui Corto","Caqui", 2);
		Pantalones pantalon2 = new Pantalones(15000, "1001", 30, "Variant", "Varian Caqui Corto","Caqui", 2);
		Pantalones pantalon3 = new Pantalones(19000, "1002", 30, "Variant", "Varian Caqui Largo","Negro", 2);
		Polera polera1 = new Polera(9000, "2002", 29, "Variant", "Variant Rojo", "Rojo");
		ArrayList<Articulos> articulos = new ArrayList<Articulos>();
		articulos.add(new pantalon1(15000, "1000", 30, "Variant", "Varian Caqui Corto","Caqui", 2));
		articulos.add(pantalon2);
		articulos.add(pantalon3);
		articulos.add(polera1);
		articulos.add(zapato2);
		articulos.add(zapato1);
		
		
		System.out.println(articulos.get(0).getMarca());
		System.out.println(articulos.get(0).getValor());
			
		}
		//menu();

	
	public static void menu() {
		Scanner menu = new Scanner(System.in);
		String opcion;
		
		System.out.println("Bienvenido al Emporio la Rosa Espinoza");
		System.out.println("¿Que desea hacer?");
		System.out.println("1 - Mostrar productor disponibles");
		System.out.println("2 - Agregar productos al carrito");
		System.out.println("3 - Pagar");
		System.out.println("4 - Salir");
		opcion = menu.nextLine();
		
		
		if(opcion.compareToIgnoreCase("1") == 0) {
			System.out.println("Prueba mostrar productos");
		} else if(opcion.compareToIgnoreCase("2") == 0) {
			System.out.println("Prueba agregar productos");
		} else if(opcion.compareToIgnoreCase("3") == 0) {
			pagar();
		} else if (opcion.compareToIgnoreCase("4") == 0) {
			System.out.println("Prueba salir");
			System.exit(0);
		} else {
			System.out.println("Estimado cliente ha ingresado una opcion no valida");
			System.out.println("Volviendo al menu anterior");
			System.out.println("--------------------------------------------------");
			menu();
		}
			 
	}
		public static void pagar() {
		
		Scanner pagar = new Scanner(System.in);
		String opcionPagar;
		
		System.out.println("¿Cual es su medio de pago");
		System.out.println("1 - Debito");
		System.out.println("2 - Credito");
		System.out.println("3 - Cancelar");
		opcionPagar = pagar.nextLine();
		if(opcionPagar.compareToIgnoreCase("1") == 0) {
			debito();
		} else if (opcionPagar.compareToIgnoreCase("2") == 0) {
			System.out.println("Prueba credito");
		} else if (opcionPagar.compareToIgnoreCase("3") == 0) {
			System.out.println("Volviendo al menu principal");
			System.out.println("- - - - - - - - - - - - - - - ");
			menu();
		}
	}
		
	public static void debito() {
		Scanner debito = new Scanner(System.in);
		String opcionDebito;
		System.out.println("Esta seguro que desea pagar con debito el total de $11111");
		System.out.println("S / N");
		opcionDebito = debito.nextLine();
		if(opcionDebito.compareToIgnoreCase("S") == 0) {
			System.out.println("Prueba Si");
		} else if (opcionDebito.compareToIgnoreCase("N") == 0) {
			System.out.println("Prueba no");
		} else {
			System.out.println("Ha ingresado una opcion no valida");
		}
}

}

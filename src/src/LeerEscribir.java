package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerEscribir {
	
	public static int leerCantLuchadores(String path) {
		int cantLuchadores = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File(path));
			cantLuchadores = sc.nextInt();
			sc.close();
			return cantLuchadores;
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo para la cantidad");
		}
		return 1;
	}
	
	public static void leerLuchadores(String path, Luchador[] l) {
		try {
			int i = 0;
			Scanner sc = new Scanner(new File(path));
			sc.nextInt();
			while (sc.hasNextInt()) {
				l[i].setAltura(sc.nextInt());
				l[i].setPeso(sc.nextInt());
				i++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo " + path);
		}
	}
}

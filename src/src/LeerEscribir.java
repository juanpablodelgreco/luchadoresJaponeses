package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerEscribir {
	
	public static Luchador[] leerLuchadores(String path) {
		try {
			int i = 0;
			Scanner sc = new Scanner(new File(path));
			Luchador[] luchadores = new Luchador[sc.nextInt()];
			for (i = 0; i < luchadores.length; i++) {
				Luchador luchador = new Luchador(sc.nextInt(), sc.nextInt());
				luchadores[i] = luchador;
			}
			sc.close();
			return luchadores;
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo " + path);
		}
		return null;
	}
}

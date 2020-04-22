package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerEscribir {

	public static void leerLuchadores(String path, Torneo t) {
		try {
			int i = 0;
			Scanner sc = new Scanner(new File(path));
			Luchador[] luchadores = new Luchador[sc.nextInt()];
			for (i = 0; i < luchadores.length; i++) {
				Luchador luchador = new Luchador(sc.nextInt(), sc.nextInt());
				luchadores[i] = luchador;
			}
			sc.close();
			t.setLuchadores(luchadores);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo " + path);
		}
	}

	public static void escribir(String path, Torneo t) {
		try {
			PrintWriter pw = new PrintWriter(new File(path));
			for (Luchador luchador : t.getLuchadores()) {
				pw.println(luchador.getDomina());
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo " + path);
		}

	}
}

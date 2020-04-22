package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerEscribir {
 private String inputPath;
 private String ouputPath;
 
 	public LeerEscribir(String inputPath, String outputPath) {
 		this.inputPath = inputPath;
 		this.ouputPath = outputPath;
 	}
 	
	public void leerLuchadores(Torneo t) {
		try {
			int i = 0;
			Scanner sc = new Scanner(new File(this.inputPath));
			Luchador[] luchadores = new Luchador[sc.nextInt()];
			for (i = 0; i < luchadores.length; i++) {
				Luchador luchador = new Luchador(sc.nextInt(), sc.nextInt());
				luchadores[i] = luchador;
			}
			sc.close();
			t.setLuchadores(luchadores);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo " + this.inputPath);
		}
	}

	public void escribir(Torneo t) {
		try {
			PrintWriter pw = new PrintWriter(new File(this.ouputPath));
			for (Luchador luchador : t.getLuchadores()) {
				pw.println(luchador.getDomina());
			}
			System.out.println("Se genero con exito el archivo "+this.ouputPath+"!");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo " + this.ouputPath);
		}

	}
}

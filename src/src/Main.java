package src;

public class Main {

	public static void main(String[] args) {
		String inputPath = "1.txt";
		String outputPath = "1.out";
		Luchador[] luchadores = null;
		luchadores = LeerEscribir.leerLuchadores(inputPath);
		for (int i = 0; i <luchadores.length; i++) {
			for(int j=0; j<luchadores.length; j++) {
				if(luchadores[i].dominaA(luchadores[j]))
					luchadores[i].setDomina(luchadores[i].getDomina()+1);
			}
		}
		LeerEscribir.escribir(outputPath, luchadores);
		System.out.println("-------------------------------------------------");
		for (Luchador l : luchadores) {
			System.out.println(l);
		}
	}
}

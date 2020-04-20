package src;

public class Main {

	public static void main(String[] args) {
		String inputPath = "1.txt";
		int cantLuchadores = 0;
		cantLuchadores = LeerEscribir.leerCantLuchadores(inputPath);
		Luchador luchadores[] = new Luchador[cantLuchadores];
		LeerEscribir.leerLuchadores(inputPath, luchadores);
		for(Luchador l : luchadores ) {
			System.out.println(l);
		}
	}
}

package src;

public class Torneo {

	private Luchador[] luchadores;
	private String nombreArchivo;

	public Torneo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void competir() {
		String inputPath = "lote_de_pruebas/Inputs/" + this.nombreArchivo + ".in";
		String outputPath = "lote_de_pruebas/Outputs/" + this.nombreArchivo + ".out";
		LeerEscribir.leerLuchadores(inputPath, this);
		for (int i = 0; i < this.getLuchadores().length; i++) {
			for (int j = 0; j < this.getLuchadores().length; j++) {
				if (this.getLuchadores()[i].dominaA(this.getLuchadores()[j]))
					this.getLuchadores()[i].setDomina(this.getLuchadores()[i].getDomina() + 1);
			}
		}
		LeerEscribir.escribir(outputPath, this);
		System.out.println("-------------------------------------------------");
		for (Luchador l : this.luchadores) {
			System.out.println(l);
		}
	}

	public Luchador[] getLuchadores() {
		return luchadores;
	}

	public void setLuchadores(Luchador[] luchadores) {
		this.luchadores = luchadores;
	}

}

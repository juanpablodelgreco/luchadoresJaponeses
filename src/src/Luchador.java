package src;

public class Luchador {
	private int peso;
	private int altura;
	private int domina;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
		this.domina = 0;
	}

	public boolean dominaA(Luchador l) {
		boolean domina = false;
		if (l.peso < this.peso && l.altura < this.altura) {
			domina = true;
		} else if (l.peso < this.peso && l.altura == this.altura) {
			domina = true;
		} else if (l.peso == this.peso && l.altura < this.altura) {
			domina = true;
		}
		return domina;
	}

	@Override
	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + ", domina=" + domina + "]";
	}

	public int getDomina() {
		return domina;
	}

	public void setDomina(int domina) {
		this.domina = domina;
	}

}

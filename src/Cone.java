
public class Cone {
	private double raio;
	private double altura;
	private double geratriz;

	public double getGeratriz() {
		return geratriz;
	}

	protected void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}

	public double getRaio() {
		return raio;
	}

	protected void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ Área do Fundo= ");
		builder.append("");
		builder.append(" Área lateral do Cone= ");
		builder.append("");
		builder.append(" Área total= ");
		builder.append("");
		builder.append("Raio= ");
		builder.append("");
		builder.append("Altura= ");
		builder.append("");
		return builder.toString();
	}
}

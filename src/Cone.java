
public class Cone {
	private double raio;
	private double altura;

	public double getRaio() {
		return raio;
	}

	protected void setRaio(double raio) {
		if(raio > 0) {
			this.raio = raio;
		} else {
			throw new UnsupportedOperationException("Valor deve ser maior que 0");
		}
		
	}

	public double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		} else {
			throw new UnsupportedOperationException("Valor deve ser maior que 0");
		}
		
	}

	public double GetGeratriz() {
		return Math.sqrt((Math.pow(raio, 2) + Math.pow(altura, 2)));
	}

	public double GetAreaBase() {
		return Math.PI * (Math.pow(raio, 2));
	}

	public double GetAreaLateral() {
		return Math.PI * raio * GetGeratriz();
	}

	public double GetAreaTotalCone() {
		return (Math.PI * raio) * (GetGeratriz() + raio);
	}

	public Cone(double raio, double altura) {
		setRaio(raio);
		setAltura(altura);
	}

	public Cone() {
		setRaio(1);
		setAltura(1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ Área do Fundo= ");
		builder.append(this.GetAreaBase());
		builder.append(", Área lateral do Cone= ");
		builder.append(this.GetAreaLateral());
		builder.append(", Área total= ");
		builder.append(this.GetAreaTotalCone());
		builder.append(", Raio= ");
		builder.append(this.getRaio());
		builder.append(", Altura= ");
		builder.append(this.getAltura());
		builder.append(" ]");
		return builder.toString();
	}
}

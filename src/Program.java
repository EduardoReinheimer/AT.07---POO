import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Cone cone;

		Scanner input = new Scanner(System.in);

		System.out.print("Raio: ");
		double r = input.nextDouble();
		System.out.print("Altura: ");
		double h = input.nextDouble();
		int tipo = 0;
		do {
			System.out.print("Nível: ");
			tipo = input.nextInt();
		} while (tipo < 1 || tipo > 3);
		
		input.close();
		
		cone =  new Cone(r,h);
		
		double precoLata = 0;
		switch (tipo) {
		case 1:
			precoLata = 238.90;
			break;
		case 2:
			precoLata = 467.98;
			break;
		case 3:
			precoLata = 758.34;
			break;
		}

		double fatorConversao = 3.45;

		double litros = cone.GetAreaTotalCone() * fatorConversao;
		int qtdLatas = GetQuantidadeLatas(litros);
		double precoTotal = precoLata * qtdLatas;

		System.out.println("------------------------------");
		System.out.println("Geratriz: " + cone.GetGeratriz());
		System.out.println("------------------------------");
		System.out.println("Área do fundo: " + cone.GetAreaBase());
		System.out.println("Área da lateral do cone: " + cone.GetAreaLateral());
		System.out.println("Área total: " + cone.GetAreaTotalCone());
		System.out.println("------------------------------");
		System.out.println("Litros: " + litros);
		System.out.println("Latas: " + qtdLatas);
		System.out.println("------------------------------");
		System.out.println("Preço total: " + precoTotal);
	}

	private static int GetQuantidadeLatas(double litros) {
		return (int) Math.ceil(litros / 18);
	}

}

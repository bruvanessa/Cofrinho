
public class Dolar extends Moeda{
	private static final double TAXA_CONVERSAO = 5.0;  //taxa conversão para real
	public Dolar(double valor) {
		super(valor, "Dólar");
	}
	public double converterParaReal() {
		return valor * TAXA_CONVERSAO;
	}

}

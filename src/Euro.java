
public class Euro extends Moeda {
	private static final double TAXA_CONVERSAO = 5.5; //taxa conversão para Real
	public Euro(double valor) {
		super(valor, "Euro");
	}


	public double converterParaReal() {
		return valor * TAXA_CONVERSAO;
	}

}

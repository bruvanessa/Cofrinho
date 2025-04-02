import java.util.ArrayList;
import java.util.Scanner;

// Classe Moeda, que será herdada por diferentes tipos de moedas
public abstract class Moeda {
	protected double valor;
	protected String pais;
	
	public Moeda(double valor, String pais) {
		this.valor = valor;
		this.pais = pais;
	}
	
//Método das subclasses conversão para Real
	public abstract double converterParaReal();
	
	@Override
	public String toString() {
		return pais + " - " + valor;
	}
}


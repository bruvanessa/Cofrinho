//classe que gerencia coleção de moedas

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> moedas;
	
	public Cofrinho() {
		moedas = new ArrayList<>();
	}
	
	//método para adicionar moeda
	public void adicionarMoeda(Moeda moeda) {
		moedas.add(moeda);
	}
	
	//método apra remover moeda
	public void removerMoeda(Moeda moeda) {
		moedas.remove(moeda);
	}
	
	//método para listar as moedas do cofrinho
	public void listarMoedas() {
		if (moedas.isEmpty()) {
			System.out.println("O Cofrinho está vázio =(");			
		} else {
			for (Moeda moeda : moedas ) {
				System.out.println(moeda);
			}
		}
	}

	//metodo para calcular total de dinheiro convertido para Real
	public double calcularTotalConvertido() {
		double total = 0;
		for (Moeda moeda : moedas) {
			total += moeda.converterParaReal();
		}
		return total;
	}

}

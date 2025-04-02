import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            // Exibição do menu de opções
            System.out.println("\n1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o tipo de moeda (1- Dólar, 2- Euro, 3- Real): ");
                int tipo = scanner.nextInt();
                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();
                if (tipo == 1) {
                    cofrinho.adicionarMoeda(new Dolar(valor));
                } else if (tipo == 2) {
                    cofrinho.adicionarMoeda(new Euro(valor));
                } else if (tipo == 3) {
                    cofrinho.adicionarMoeda(new Real(valor));
                } else {
                    System.out.println("Tipo inválido!");
                }
            } else if (opcao == 2) {
                cofrinho.listarMoedas();
                System.out.print("Digite o índice da moeda a ser removida (começando de 0): ");
                int index = scanner.nextInt();
                if (index >= 0 && index < cofrinho.moedas.size()) {
                    cofrinho.removerMoeda(cofrinho.moedas.get(index));
                    System.out.println("Moeda removida.");
                } else {
                    System.out.println("Índice inválido!");
                }
            } else if (opcao == 3) {
                cofrinho.listarMoedas();
            } else if (opcao == 4) {
                System.out.println("Total convertido em Real: R$" + cofrinho.calcularTotalConvertido());
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
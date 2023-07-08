import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aviao {
    private String modelo;
    private int ano;
    private int qtdPassageiros;
    private double pesoDecolagem;
    private double tamanhoAsa;
    private int velocidadeMax;
    private int alcanceMax;
    private int numMotores;
    private int distAssentos;

    public Aviao(String modelo, int ano, int qtdPassageiros, double pesoDecolagem, double tamanhoAsa,
                 int velocidadeMax, int alcanceMax, int numMotores, int distAssentos) {
        this.modelo = modelo;
        this.ano = ano;
        this.qtdPassageiros = qtdPassageiros;
        this.pesoDecolagem = pesoDecolagem;
        this.tamanhoAsa = tamanhoAsa;
        this.velocidadeMax = velocidadeMax;
        this.alcanceMax = alcanceMax;
        this.numMotores = numMotores;
        this.distAssentos = distAssentos;
    }

    // getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // ... outros getters e setters para os demais atributos

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "\nAno: " + ano +
                "\nQuantidade de Passageiros: " + qtdPassageiros +
                "\nPeso de Decolagem: " + pesoDecolagem +
                "\nTamanho da Asa: " + tamanhoAsa +
                "\nVelocidade Máxima: " + velocidadeMax +
                "\nAlcance Máximo: " + alcanceMax +
                "\nNúmero de Motores: " + numMotores +
                "\nDistância entre Assentos: " + distAssentos;
    }
}

class SistemaControle {
    private List<Aviao> listaAvioes;

    public SistemaControle() {
        listaAvioes = new ArrayList<>();
    }

    public void adicionarAviao(Aviao aviao) {
        listaAvioes.add(aviao);
        System.out.println("Avião adicionado com sucesso!");
    }

    public void exibirAvioes() {
        for (Aviao aviao : listaAvioes) {
            System.out.println(aviao);
            System.out.println("------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaControle sistema = new SistemaControle();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistema de Controle da Air France ===");
            System.out.println("1. Adicionar Avião");
            System.out.println("2. Exibir Aviões");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Adicionar Avião ===");
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Quantidade de Passageiros: ");
                    int qtdPassageiros = scanner.nextInt();
                    System.out.print("Peso de Decolagem: ");
                    double pesoDecolagem = scanner.nextDouble();
                    System.out.print("Tamanho da Asa: ");
                    double tamanhoAsa = scanner.nextDouble();
                    System.out.print("Velocidade Máxima: ");
                    int velocidadeMax = scanner.nextInt();
                    System.out.print("Alcance Máximo: ");
                    int alcanceMax = scanner.nextInt();
                    System.out.print("Número de Motores: ");
                    int numMotores = scanner.nextInt();
                    System.out.print("Distância entre Assentos: ");
                    int distAssentos = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Aviao aviao = new Aviao(modelo, ano, qtdPassageiros, pesoDecolagem, tamanhoAsa,
                            velocidadeMax, alcanceMax, numMotores, distAssentos);
                    sistema.adicionarAviao(aviao);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("\n=== Aviões Cadastrados ===");
                    sistema.exibirAvioes();
                    System.out.println();
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    return;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
                    break;
            }
        }
    }
}

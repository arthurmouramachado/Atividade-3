import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Exercício 1: Notas
        System.out.println("\n=== Exercício 1: Notas ===");
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        Notas notas = new Notas(nota1, nota2);
        notas.calcularNotaFinal();
        
        // Exercício 2: Bhaskara
        System.out.println("\n=== Exercício 2: Bhaskara ===");
        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();
        Bhaskara bhaskara = new Bhaskara(a, b, c);
        bhaskara.calcularRaizes();
        
        // Exercício 3: Menor de Três
        System.out.println("\n=== Exercício 3: Menor de Três ===");
        System.out.print("Primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int num2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int num3 = sc.nextInt();
        MenordeTres menordeTres = new MenordeTres(num1, num2, num3);
        System.out.println("MENOR = " + menordeTres.encontrarMenor());
        
        // Exercício 4: Telefonia
        System.out.println("\n=== Exercício 4: Telefonia ===");
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        Telefonia telefonia = new Telefonia(minutos);
        System.out.printf("Valor a pagar: R$ %.2f%n", telefonia.calcularValorPlano());
        
        // Exercício 5: Troco
        System.out.println("\n=== Exercício 5: Troco ===");
        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();
        Troco troco = new Troco(preco, qtd, dinheiro);
        troco.calcularTroco();
        
        // Exercício 6: Glicose
        System.out.println("\n=== Exercício 6: Glicose ===");
        System.out.print("Digite a medida da glicose: ");
        double medida = sc.nextDouble();
        Glicose glicose = new Glicose(medida);
        System.out.println("Classificação: " + glicose.classificarGlicose());
        
        // Exercício 7: Dardo
        System.out.println("\n=== Exercício 7: Dardo ===");
        System.out.println("Digite as três distâncias:");
        double dist1 = sc.nextDouble();
        double dist2 = sc.nextDouble();
        double dist3 = sc.nextDouble();
        Dardo dardo = new Dardo(dist1, dist2, dist3);
        System.out.printf("MAIOR DISTÂNCIA = %.2f%n", dardo.encontrarMaiorDistancia());
        
        // Exercício 8: Temperatura
        System.out.println("\n=== Exercício 8: Temperatura ===");
        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().charAt(0);
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        Temperatura temperatura = new Temperatura(escala, temp);
        temperatura.converterTemperatura();
        
        // Exercício 9: Lanchonete
        System.out.println("\n=== Exercício 9: Lanchonete ===");
        System.out.print("Código do produto comprado: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        Lanchonete lanchonete = new Lanchonete(codigo, quantidade);
        System.out.printf("Valor a pagar: R$ %.2f%n", lanchonete.calcularValor());
        
        // Exercício 10: Múltiplos
        System.out.println("\n=== Exercício 10: Múltiplos ===");
        System.out.println("Digite dois números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Multiplos multiplos = new Multiplos(n1, n2);
        System.out.println(multiplos.verificarMultiplos() ? "São múltiplos" : "Não são múltiplos");
        
        // Exercício 11: Salário
        System.out.println("\n=== Exercício 11: Salário ===");
        System.out.print("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();
        Salario salarioObj = new Salario(salario);
        salarioObj.calcularAumento();
        
        // Exercício 12: Jogo
        System.out.println("\n=== Exercício 12: Jogo ===");
        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();
        Jogo jogo = new Jogo(horaInicial, horaFinal);
        System.out.println("O JOGO DUROU " + jogo.calcularDuracao() + " HORA(S)");
        
        // Exercício 13: Coordenadas
        System.out.println("\n=== Exercício 13: Coordenadas ===");
        System.out.print("Valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();
        Coordenadas coordenadas = new Coordenadas(x, y);
        System.out.println(coordenadas.determinarQuadrante());
        
        sc.close();
    }
}
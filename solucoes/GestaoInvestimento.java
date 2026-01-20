import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe que representa a entidade de negócio
class Terreno {
    String identificacao;
    double area;
    double preco;

    Terreno(String id, double largura, double comprimento, double valorMetro) {
        this.identificacao = id;
        this.area = largura * comprimento;
        this.preco = this.area * valorMetro;
    }
}

public class GestaoInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Terreno> portfolio = new ArrayList<>();

        System.out.println("=== MOTechSolutions: Enterprise Property Management ===");

        while (true) {
            System.out.print("\nID do Terreno (ou 'sair'): ");
            String id = sc.nextLine();
            if (id.equalsIgnoreCase("sair")) break;

            System.out.print("Largura: ");
            double l = Double.parseDouble(sc.nextLine());
            System.out.print("Comprimento: ");
            double c = Double.parseDouble(sc.nextLine());
            System.out.print("Valor por m²: ");
            double v = Double.parseDouble(sc.nextLine());

            portfolio.add(new Terreno(id, l, c, v));
        }

        // Relatório Final
        System.out.println("\n--- RELATÓRIO DE PORTFÓLIO MOTECH ---");
        double total = 0;
        for (Terreno t : portfolio) {
            System.out.printf("ID: %-15s | Área: %8.2f m² | Valor: R$ %10.2f%n", 
                               t.identificacao, t.area, t.preco);
            total += t.preco;
        }
        System.out.printf("\nVALOR TOTAL DO PORTFÓLIO: R$ %.2f%n", total);
        System.out.println("=========================================");
        sc.close();
    }
}

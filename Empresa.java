
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite o nome do Gerente: ");
        String nomeG = scanner.nextLine();
        System.out.println("Digite o salario do Gerente: ");
        double salarioG = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nDigite o nome do FreeLancer: ");
        String nomeF = scanner.nextLine();
        System.out.println("Digite o valor/dia do Freelancer: ");
        double valorDia = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a quantidade de dias trabalhados: ");
        int diasTrabalhados = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do Vendedor: ");
        String nomeV = scanner.nextLine();
        System.out.println("Digite o salário base do vendedor: ");
        double salarioV = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a comissão do vendedor: ");
        double comissao = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Salário do Vendedor " + nomeV + "-" + obterSalarioDoFuncionario(new Vendedor(salarioV, comissao)));
        System.out.println("Salário do FreeLancer " + nomeF + "-" + obterSalarioDoFuncionario(new FreeLancer(diasTrabalhados, valorDia)));
        System.out.println("Salário do Gerente " + nomeG + "-" + obterSalarioDoFuncionario(new Gerente(salarioG)));

        scanner.close();
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal();
    }
}

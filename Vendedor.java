public class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissao;

    public Vendedor(double salarioBase, double comissao){
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissao;
    }
}

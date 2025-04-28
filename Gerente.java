public class Gerente extends Funcionario {
    private double salarioBase;

    public Gerente(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + 1000;
    }
}

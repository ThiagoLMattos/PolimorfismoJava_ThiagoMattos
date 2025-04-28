public class FreeLancer extends Funcionario{
    private int diasTrabalhados;
    private double valorDia;

    public FreeLancer(int diasTrabalhados, double valorDia) {
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    @Override
    public double calcularSalarioFinal() {
        return diasTrabalhados*valorDia;
    }
}

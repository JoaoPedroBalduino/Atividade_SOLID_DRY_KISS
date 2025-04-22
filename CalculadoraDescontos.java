public class CalculadoraDescontos {

    public double calcularDesconto(double preco, double percentual) {
        return preco - (preco * percentual);
    }

    public double calcularDescontoProdutoA(double preco) {
        return calcularDesconto(preco, 0.1);
    }

    public double calcularDescontoProdutoB(double preco) {
        return calcularDesconto(preco, 0.15);
    }

    public double calcularDescontoProdutoC(double preco) {
        return calcularDesconto(preco, 0.2);
    }
}

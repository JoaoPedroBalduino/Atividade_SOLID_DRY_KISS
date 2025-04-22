public class DescontoMain {
    public static void main(String[] args) {
        CalculadoraDescontos calc = new CalculadoraDescontos();
        double precoOriginal = 100.0;

        System.out.println("Produto A: R$" + calc.calcularDescontoProdutoA(precoOriginal));
        System.out.println("Produto B: R$" + calc.calcularDescontoProdutoB(precoOriginal));
        System.out.println("Produto C: R$" + calc.calcularDescontoProdutoC(precoOriginal));
    }
}

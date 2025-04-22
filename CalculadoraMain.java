public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Potência: " + calc.potencia(2, 3));
        System.out.println("Raiz: " + calc.raizQuadrada(16));
    }
}

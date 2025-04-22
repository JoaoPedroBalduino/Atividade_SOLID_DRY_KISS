public class FaturaMain {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("002", "Teclado Mecânico", 2, 250.0);
        System.out.println("Total da Fatura: R$" + fatura.getTotalFatura());
    }
}

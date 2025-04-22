public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.precoPorItem = precoPorItem > 0 ? precoPorItem : 0.0;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(0, quantidade);
    }

    public double getPrecoPorItem() { return precoPorItem; }
    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = Math.max(0.0, precoPorItem);
    }

    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}

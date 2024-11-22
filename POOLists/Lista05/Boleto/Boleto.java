import java.time.LocalDate;

public class Boleto {
    private String codBarras;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private double valorBoleto;
    private double valorPago;
    private Pagamento situacaoPagamento;

    public Boleto(String cod, LocalDate emissao, LocalDate venc, double valor){
        codBarras = cod;
        dataEmissao = emissao;
        if (venc.compareTo(emissao) > 0) {
            dataVencimento = venc;
        } else throw new IllegalArgumentException("Data de vencimento inválida.");
        if (valor > 0) {
            valorBoleto = valor;
        } else throw new IllegalArgumentException("Valor do boleto inválido.");
    }

    public void Pagar(double valorP){
        if (valorP <= valorBoleto){
            valorPago = valorP;
        } else throw new IllegalArgumentException("Pagamento maior que o valor do boleto.");
    }
    

    public Pagamento Situacao(){
        Pagamento situacao;
        if (valorPago == valorBoleto) {
            situacao = Pagamento.PAGO;
        } else if (valorPago == 0) {
            situacao = Pagamento.EMABERTO;
        } else {
            situacao = Pagamento.PAGOPARCIAL;
        }
        return situacao;
    }

    public String toString(){
        return String.format("Código de barras = %s \n Data de emissao = %s \n Data de vencimento = %s \n Valor do boleto = R$ %s \n Valor pago: %s", codBarras, dataEmissao, dataVencimento, valorBoleto, valorPago);
    }
}

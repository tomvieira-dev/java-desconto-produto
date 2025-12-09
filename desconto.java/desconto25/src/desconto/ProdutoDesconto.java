package desconto;

public class ProdutoDesconto {
    
    String nomeProduto;
    double precoBase;

    static double descontoEspecial = 0.30;
    static double desconto = 0.25;

    public ProdutoDesconto(String nomeProduto, double precoBase) {
        this.nomeProduto = nomeProduto;
        this.precoBase = precoBase;

    }

    double precoComDesconto() {
        return precoBase - (precoBase * desconto);
    }

    double precoComDescontoEspecial(double descontoEspecial) {
        return precoBase - (precoBase * descontoEspecial);
    }

}

package desconto;

public class ProdutoDescontoTeste {
    public static void main(String[] args) {

        ProdutoDesconto produto1 = new ProdutoDesconto("Notebook", 4000.0);
        ProdutoDesconto produto2 = new ProdutoDesconto("Smartphone", 2500.0);
        ProdutoDesconto produto3 = new ProdutoDesconto("Tablet", 1500.0);
        ProdutoDesconto produto4 = new ProdutoDesconto("Monitor", 800.0);

        double precoComDescontoProduto1 = produto1.precoComDesconto();
        double precoComDescontoEspecialProduto1 = produto1.precoComDescontoEspecial(ProdutoDesconto.descontoEspecial);

        double precoComDescontoProduto2 = produto2.precoComDesconto();
        double precoComDescontoEspecialProduto2 = produto2.precoComDescontoEspecial(ProdutoDesconto.descontoEspecial);

        double precoComDescontoProduto3 = produto3.precoComDesconto();
        double precoComDescontoEspecialProduto3 = produto3.precoComDescontoEspecial(ProdutoDesconto.descontoEspecial);

        double precoComDescontoProduto4 = produto4.precoComDesconto();
        double precoComDescontoEspecialProduto4 = produto4.precoComDescontoEspecial(ProdutoDesconto.descontoEspecial);

        System.out.println("Produto: " + produto1.nomeProduto);
        System.out.println("Preço original: R$ " + produto1.precoBase);
        System.out.println("Preço com desconto padrão: R$ " + precoComDescontoProduto1);
        System.out.println("Preço com desconto especial: R$ " + precoComDescontoEspecialProduto1);
        System.out.println();
        System.out.println("Produto: " + produto2.nomeProduto);
        System.out.println("Preço original: R$ " + produto2.precoBase);
        System.out.println("Preço com desconto padrão: R$ " + precoComDescontoProduto2);
        System.out.println("Preço com desconto especial: R$ " + precoComDescontoEspecialProduto2);
        System.out.println();
        System.out.println("Produto: " + produto3.nomeProduto);
        System.out.println("Preço original: R$ " + produto3.precoBase);
        System.out.println("Preço com desconto padrão: R$ " + precoComDescontoProduto3);
        System.out.println("Preço com desconto especial: R$ " + precoComDescontoEspecialProduto3);
        System.out.println();
        System.out.println("Produto: " + produto4.nomeProduto);
        System.out.println("Preço original: R$ " + produto4.precoBase);
        System.out.println("Preço com desconto padrão R$ " + precoComDescontoProduto4);
        System.out.println("Preço com desconto especial: " + precoComDescontoEspecialProduto4);
    }

}

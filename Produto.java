public class Produto{
    // Atributo que representa o ID único do produto (gerado pelo banco de dados)
    private int idProduto;
    // Nome do aluno do produto
    private String nomeProduto;
    // Preço do produto
    private double preco;
    // Senha do usuário
    private int idCategoriaProduto;
    //Quantidade de Saída
    private int QuantidadeSaida;
    //Quantidade de Entrada
    private int QuantidadeEntrada;

    // Construtor completo - usado quando todos os dados já estão disponíveis
    public Produto(int idProduto, String nomeProduto, double preco, int idCategoriaProduto, int QuantidadeSaida, int QuantidadeEntrada ) {
        this.idAluno = idProduto;
        this.nome = nomeProduto;
        this.preco = preco;
        this.idCategoriaProduto = ididCategoriaProduto;
        this.QuantidadeSaida = QuantidadeSaida;
        this.QuantidadeEntrada = QuantidadeEntrada;
    }

    // Métodos getters - usados para acessar os valores dos atributos

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getPreco() {
        return preco;
    }

    public double getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public String getQuantidadeSaida() {
        return QuantidadeSaida;
    }

    public String getQuantidadeEntrada() {
        return QuantidadeEntrada;
    }

    // Métodos setters - usados para modificar os valores dos atributos

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setIdCategoriaProduto(int idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    public void setQuantidadeSaida(int QuantidadeSaida) {
        this.QuantidadeSaida = QuantidadeSaida;
    }

    public void setQuantidadeEntrada(int QuantidadeEntrada) {
        this.QuantidadeEntrada = QuantidadeEntrada;
    }
}



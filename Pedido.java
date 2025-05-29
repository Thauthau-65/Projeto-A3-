public class Pedido extends Produto, Usuario {
    // Atributo que representa o ID único do produto (gerado pelo banco de dados)
    private Date Data;
     // Status do pedido
    private String Status;
    // Preço total do pedido
    private double TotalPedido;

    public Pedido(Date data, String Status, double TotalPedido){

    super(idUsuario);
    super(idProduto);

    this.Data = Data;
    this.Status = Status;
    this.TotalPedido = TotalPedido;

    }

    // Métodos getters - usados para acessar os valores dos atributos

    public int getData() {
        return Data;
    }

    public String getStatus() {
        return Status;
    }

    public String getTotalPedido() {
        return TotalPedido;
    }

     // Métodos setters - usados para modificar os valores dos atributos

    public void setData(Date Data) {
        this.Data = Data;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setTotalPedido(double TotalPedido) {
        this.TotalPedido = TotalPedido;
    }
}

   
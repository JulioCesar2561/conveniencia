package model;

public class Item {

    private double precoUnitario;
    private double desconto;
    private String descriccao;
    private Integer quantidade;
    private Integer id;

    public Item (){

    }

    public Item(Integer id, String descriccao, Integer quantidade, double precoUnitario) {
        this.precoUnitario = precoUnitario;
        this.descriccao = descriccao;
        this.quantidade = quantidade;
        this.id = id;
    }

    public double getAjustePrecoTotal(){
        double total = this.precoUnitario * this.quantidade;
        double totalDesconto = total * this.desconto;
        double totalComDesconto = total - totalDesconto;
        return totalComDesconto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto <= 1){
            this.desconto = desconto;
        }else {
            this.desconto = 0.0;
        }
    }

    public String getDescriccao() {
        return descriccao;
    }

    public void setDescriccao(String descriccao) {
        this.descriccao = descriccao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

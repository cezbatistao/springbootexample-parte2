package br.com.batistao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by ceb on 30/04/16.
 */
@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="PRECO_UNITARIO")
    private Double precoUnitario;

    @NotNull
    @Column(name="QUANTIDADE")
    private Integer quantidade;

    @NotNull
    @Column(name="PRECO_TOTAL")
    private Double precoTotal;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido", referencedColumnName = "id")
    private Pedido pedido;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto", referencedColumnName = "id")
    private Produto produto;

    ItemPedido() {
        // default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                ", precoTotal=" + precoTotal +
                ", produto=" + produto +
                '}';
    }
}

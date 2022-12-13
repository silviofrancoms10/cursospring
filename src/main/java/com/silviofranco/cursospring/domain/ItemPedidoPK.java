package com.silviofranco.cursospring.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ItemPedidoPK implements Serializable {
    private static final long serialVersionUID = 1L;

        @ManyToOne
        @JoinColumn(name = "pedido_id")
        private Pedido pedido;

        @ManyToOne
        @JoinColumn(name = "produto_id")
        private Produto produto;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemPedidoPK that = (ItemPedidoPK) o;

        if (!pedido.equals(that.pedido)) return false;
        return produto.equals(that.produto);
    }

    @Override
    public int hashCode() {
        int result = pedido.hashCode();
        result = 31 * result + produto.hashCode();
        return result;
    }
}

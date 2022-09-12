package bean;
// Generated 06/09/2022 15:59:02 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VendasProdutos generated by hbm2java
 */
@Entity
@Table(name="vendas_produtos"
    ,catalog="mpv"
)
public class VendasProdutos  implements java.io.Serializable {


     private VendasProdutosId id;
     private Produtos produtos;
     private Vendas vendas;
     private Integer quantidade;
     private BigDecimal valorUnitario;

    public VendasProdutos() {
    }

	
    public VendasProdutos(VendasProdutosId id, Produtos produtos, Vendas vendas) {
        this.id = id;
        this.produtos = produtos;
        this.vendas = vendas;
    }
    public VendasProdutos(VendasProdutosId id, Produtos produtos, Vendas vendas, Integer quantidade, BigDecimal valorUnitario) {
       this.id = id;
       this.produtos = produtos;
       this.vendas = vendas;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idvendas", column=@Column(name="idvendas", nullable=false) ), 
        @AttributeOverride(name="produto", column=@Column(name="produto", nullable=false) ) } )
    public VendasProdutosId getId() {
        return this.id;
    }
    
    public void setId(VendasProdutosId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produto", nullable=false, insertable=false, updatable=false)
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idvendas", nullable=false, insertable=false, updatable=false)
    public Vendas getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    
    @Column(name="quantidade")
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="valor_unitario", precision=10)
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }




}



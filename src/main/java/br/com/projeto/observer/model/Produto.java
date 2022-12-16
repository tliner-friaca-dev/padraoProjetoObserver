package br.com.projeto.observer.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Produto {
    
    private Long codigo;
    private String nome;
    private BigDecimal valor;
    private LocalDate dataInicioPromocao;
    private LocalDate dataFimPromocao;
    private BigDecimal valorPromocao;

    public Produto() {
    }

    private Produto(Long codigo, String nome, BigDecimal valor, LocalDate dataInicioPromocao, LocalDate dataFimPromocao, BigDecimal valorPromocao) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.dataInicioPromocao = dataInicioPromocao;
        this.dataFimPromocao = dataFimPromocao;
        this.valorPromocao = valorPromocao;
    }

    public static class ProdutoBuilder {

        private Long codigo;
        private String nome;
        private BigDecimal valor;
        private LocalDate dataInicioPromocao;
        private LocalDate dataFimPromocao;
        private BigDecimal valorPromocao;

        public ProdutoBuilder comCodigo(Long codigo) {
            this.codigo = codigo;
            return this;
        }

        public ProdutoBuilder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public ProdutoBuilder comValor(BigDecimal valor) {
            this.valor = valor;
            return this;
        }

        public ProdutoBuilder comDataInicioPromocao(LocalDate dataInicioPromocao) {
            this.dataInicioPromocao = dataInicioPromocao;
            return this;
        }

        public ProdutoBuilder comDataFimPromocao(LocalDate dataFimPromocao) {
            this.dataFimPromocao = dataFimPromocao;
            return this;
        }

        public ProdutoBuilder comValorPromocao(BigDecimal valorPromocao) {
            this.valorPromocao = valorPromocao;
            return this;
        }

        public Produto construir() {
            return new Produto(codigo, nome, valor, dataInicioPromocao, dataFimPromocao, valorPromocao);
        }

    }

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataInicioPromocao() {
        return this.dataInicioPromocao;
    }

    public void setDataInicioPromocao(LocalDate dataInicioPromocao) {
        this.dataInicioPromocao = dataInicioPromocao;
    }

    public LocalDate getDataFimPromocao() {
        return this.dataFimPromocao;
    }

    public void setDataFimPromocao(LocalDate dataFimPromocao) {
        this.dataFimPromocao = dataFimPromocao;
    }

    public BigDecimal getValorPromocao() {
        return this.valorPromocao;
    }

    public void setValorPromocao(BigDecimal valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public Produto codigo(Long codigo) {
        setCodigo(codigo);
        return this;
    }

    public Produto nome(String nome) {
        setNome(nome);
        return this;
    }

    public Produto valor(BigDecimal valor) {
        setValor(valor);
        return this;
    }

    public Produto dataInicioPromocao(LocalDate dataInicioPromocao) {
        setDataInicioPromocao(dataInicioPromocao);
        return this;
    }

    public Produto dataFimPromocao(LocalDate dataFimPromocao) {
        setDataFimPromocao(dataFimPromocao);
        return this;
    }

    public Produto valorPromocao(BigDecimal valorPromocao) {
        setValorPromocao(valorPromocao);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo) && Objects.equals(nome, produto.nome) && Objects.equals(valor, produto.valor) && Objects.equals(dataInicioPromocao, produto.dataInicioPromocao) && Objects.equals(dataFimPromocao, produto.dataFimPromocao) && Objects.equals(valorPromocao, produto.valorPromocao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, valor, dataInicioPromocao, dataFimPromocao, valorPromocao);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", valor='" + getValor() + "'" +
            ", dataInicioPromocao='" + getDataInicioPromocao() + "'" +
            ", dataFimPromocao='" + getDataFimPromocao() + "'" +
            ", valorPromocao='" + getValorPromocao() + "'" +
            "}";
    }

}

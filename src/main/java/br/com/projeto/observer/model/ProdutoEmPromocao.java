package br.com.projeto.observer.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ProdutoEmPromocao {
    
    private Pessoa pessoa;
    private Produto produto;

    public ProdutoEmPromocao() {
    }

    private ProdutoEmPromocao(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public static class ProdutoEmPromocaoBuilder {

        private Pessoa pessoa;
        private Produto produto;

        public ProdutoEmPromocaoBuilder comPessoa(Long codigo, String nome, String email, String telefoneSms, String telefoneWhatsapp, Boolean receberPromocao) {
            Pessoa pessoa = new Pessoa.PessoaBuilder()
                                .comCodigo(codigo)
                                .comNome(nome)
                                .comEmail(email)
                                .comTelefoneSms(telefoneSms)
                                .comTelefoneWhatsapp(telefoneWhatsapp)
                                .comReceberPromocao(receberPromocao)
                                .construir();

            this.pessoa = pessoa;
            return this;
        }

        public ProdutoEmPromocaoBuilder comProduto(Long codigo, String nome, BigDecimal valor, LocalDate dataInicioPromocao, LocalDate dataFimPromocao, BigDecimal valorPromocao) {
            Produto produto = new Produto.ProdutoBuilder()
                                .comCodigo(codigo)
                                .comNome(nome)
                                .comValor(valor)
                                .comDataInicioPromocao(dataInicioPromocao)
                                .comDataFimPromocao(dataFimPromocao)
                                .comValorPromocao(valorPromocao)
                                .construir();

            this.produto = produto;
            return this;
        }

        public ProdutoEmPromocao construir() {
            return new ProdutoEmPromocao(pessoa, produto);
        }
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ProdutoEmPromocao pessoa(Pessoa pessoa) {
        setPessoa(pessoa);
        return this;
    }

    public ProdutoEmPromocao produto(Produto produto) {
        setProduto(produto);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProdutoEmPromocao)) {
            return false;
        }
        ProdutoEmPromocao produtoEmPromocao = (ProdutoEmPromocao) o;
        return Objects.equals(pessoa, produtoEmPromocao.pessoa) && Objects.equals(produto, produtoEmPromocao.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pessoa, produto);
    }

    @Override
    public String toString() {
        return "{" +
            " pessoa='" + getPessoa() + "'" +
            ", produto='" + getProduto() + "'" +
            "}";
    }

}

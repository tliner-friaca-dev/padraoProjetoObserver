package br.com.projeto.observer.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.projeto.observer.model.ProdutoEmPromocao;

public class ProdutoEmPromocaoRepository {

    public List<ProdutoEmPromocao> buscarProdutoEmPromocao() {

        ProdutoEmPromocao produtoEmPromocao1 = new ProdutoEmPromocao.ProdutoEmPromocaoBuilder()
                                                .comPessoa(1L, "Pessoa1", "email_1", "1111-1111", "0000-1111", Boolean.TRUE)
                                                .comProduto(1L, "Produto_1", new BigDecimal("10"), LocalDate.parse("2022-01-01"), LocalDate.parse("2023-01-01"), new BigDecimal("5"))
                                                .construir();

        ProdutoEmPromocao produtoEmPromocao2 = new ProdutoEmPromocao.ProdutoEmPromocaoBuilder()
                                                .comPessoa(2L, "Pessoa2", "email_2", "2222-2222", "0000-2222", Boolean.TRUE)
                                                .comProduto(2L, "Produto_2", new BigDecimal("10"), LocalDate.parse("2022-01-01"), LocalDate.parse("2023-01-01"), new BigDecimal("5"))
                                                .construir();
        return Arrays.asList(produtoEmPromocao1, produtoEmPromocao2);

    }
    
    
}

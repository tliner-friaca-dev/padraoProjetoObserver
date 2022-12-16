package br.com.projeto.observer.ouvintes;

import java.util.List;

import br.com.projeto.observer.model.ProdutoEmPromocao;
import br.com.projeto.observer.notificador.Notificador;

public class SmsOuvinte implements OuvinteInt {

    private Notificador notificador;

    public SmsOuvinte(Notificador notificador) {
        this.notificador = notificador;
        this.notificador.registrarOuvinte(this);
    }

    @Override
    public void avisarPromocao() {

        List<ProdutoEmPromocao> produtosEmPromocao = this.notificador.getProdutosEmPromocao();

        for (ProdutoEmPromocao produtoEmPromocao : produtosEmPromocao) {
            System.out.println("Enviando SMS para: " + produtoEmPromocao.getPessoa().getNome() 
                                + ", com o produto: " + produtoEmPromocao.getProduto().getNome());
        }
        
    }
    
}

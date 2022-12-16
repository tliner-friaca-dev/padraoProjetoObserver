package br.com.projeto.observer.notificador;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.projeto.observer.model.ProdutoEmPromocao;
import br.com.projeto.observer.ouvintes.OuvinteInt;

public class NotificadorProdutosEmPromocao implements Notificador {

    private Set<OuvinteInt> ouvintesInt;
    private List<ProdutoEmPromocao> produtosEmPromocao;

    public NotificadorProdutosEmPromocao() {
        this.ouvintesInt = new HashSet<>();
    }

    @Override
    public void registrarOuvinte(OuvinteInt ouvinteInt) {
        this.ouvintesInt.add(ouvinteInt);
    }

    @Override
    public void removerOuvinte(OuvinteInt ouvinteInt) {
        this.ouvintesInt.remove(ouvinteInt);
    }

    @Override
    public void notificarOuvintes() {
        for (OuvinteInt ouvinteInt : ouvintesInt) {
            ouvinteInt.avisarPromocao();
        }
    }

    @Override
    public void novosProdutosEmPromocao(List<ProdutoEmPromocao> produtosEmPromocao) {
        this.produtosEmPromocao = produtosEmPromocao;
        this.notificarOuvintes();
    }

    @Override
    public List<ProdutoEmPromocao> getProdutosEmPromocao() {
        return this.produtosEmPromocao;
    }
    
}

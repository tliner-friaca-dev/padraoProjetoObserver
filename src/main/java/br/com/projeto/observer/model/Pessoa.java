package br.com.projeto.observer.model;

import java.util.Objects;

public class Pessoa {

    public static Boolean RECEBER_PROMOCAO_SIM = Boolean.TRUE;
    public static Boolean RECEBER_PROMOCAO_NAO = Boolean.FALSE;
    
    private Long codigo;
    private String nome;
    private String email;
    private String telefoneSms;
    private String telefoneWhatsapp;
    private Boolean receberPromocao;

    public Pessoa() {
    }

    private Pessoa(Long codigo, String nome, String email, String telefoneSms, String telefoneWhatsapp, Boolean receberPromocao) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefoneSms = telefoneSms;
        this.telefoneWhatsapp = telefoneWhatsapp;
        this.receberPromocao = receberPromocao;
    }

    public static class PessoaBuilder {

        private Long codigo;
        private String nome;
        private String email;
        private String telefoneSms;
        private String telefoneWhatsapp;
        private Boolean receberPromocao;

        public PessoaBuilder comCodigo(Long codigo) {
            this.codigo = codigo;
            return this;
        }
        
        public PessoaBuilder comNome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public PessoaBuilder comEmail(String email) {
            this.email = email;
            return this;
        }
        
        public PessoaBuilder comTelefoneSms(String telefoneSms) {
            this.telefoneSms = telefoneSms;
            return this;
        }
        
        public PessoaBuilder comTelefoneWhatsapp(String telefoneWhatsapp) {
            this.telefoneWhatsapp = telefoneWhatsapp;
            return this;
        }
        
        public PessoaBuilder comReceberPromocao(Boolean receberPromocao) {
            this.receberPromocao = receberPromocao;
            return this;
        }

        public Pessoa construir() {
            return new Pessoa(codigo, nome, email, telefoneSms, telefoneWhatsapp, receberPromocao);
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneSms() {
        return this.telefoneSms;
    }

    public void setTelefoneSms(String telefoneSms) {
        this.telefoneSms = telefoneSms;
    }

    public String getTelefoneWhatsapp() {
        return this.telefoneWhatsapp;
    }

    public void setTelefoneWhatsapp(String telefoneWhatsapp) {
        this.telefoneWhatsapp = telefoneWhatsapp;
    }

    public Boolean isReceberPromocao() {
        return this.receberPromocao;
    }

    public Boolean getReceberPromocao() {
        return this.receberPromocao;
    }

    public void setReceberPromocao(Boolean receberPromocao) {
        this.receberPromocao = receberPromocao;
    }

    public Pessoa codigo(Long codigo) {
        setCodigo(codigo);
        return this;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa email(String email) {
        setEmail(email);
        return this;
    }

    public Pessoa telefoneSms(String telefoneSms) {
        setTelefoneSms(telefoneSms);
        return this;
    }

    public Pessoa telefoneWhatsapp(String telefoneWhatsapp) {
        setTelefoneWhatsapp(telefoneWhatsapp);
        return this;
    }

    public Pessoa receberPromocao(Boolean receberPromocao) {
        setReceberPromocao(receberPromocao);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(codigo, pessoa.codigo) && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email) && Objects.equals(telefoneSms, pessoa.telefoneSms) && Objects.equals(telefoneWhatsapp, pessoa.telefoneWhatsapp) && Objects.equals(receberPromocao, pessoa.receberPromocao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, email, telefoneSms, telefoneWhatsapp, receberPromocao);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", telefoneSms='" + getTelefoneSms() + "'" +
            ", telefoneWhatsapp='" + getTelefoneWhatsapp() + "'" +
            ", receberPromocao='" + isReceberPromocao() + "'" +
            "}";
    }

}

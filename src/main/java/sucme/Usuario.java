package sucme;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    private boolean flagAdministrador;
    private String uf;
    private String afiliacaoPolitica;
    
    public Usuario () {
    }
    
    public Usuario (int id) {
        this.id = id;
    }
    
    public Usuario (String nome, LocalDate dataNascimento, String email, String senha, String cpf, String uf, String afiliacaoPolitica) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.uf = uf;
        this.afiliacaoPolitica = afiliacaoPolitica;
    }
    
    public Usuario (String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario (String nome, LocalDate dataNascimento, String email, String senha, String cpf, boolean flagAdministrador, String uf, String afiliacaoPolitica) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.flagAdministrador = flagAdministrador;
        this.uf = uf;
        this.afiliacaoPolitica = afiliacaoPolitica;
    }
    
    public Usuario (int id, String nome, LocalDate dataNascimento, String email, String senha, String cpf, boolean flagAdministrador, String uf, String afiliacaoPolitica) {
        this(nome, dataNascimento, email, senha, cpf, flagAdministrador, uf, afiliacaoPolitica);
        this.id = id;
    }
    
    public Usuario (int id, String nome, LocalDate dataNascimento, String email, String senha, String cpf, String uf, String afiliacaoPolitica) {
        this(nome, dataNascimento, email, senha, cpf, uf, afiliacaoPolitica);
        this.id = id;
    }    
    
    public Relatorio gerarRelatorio () {
        Relatorio r = new Relatorio();
        //escrever o metodo pra instanciar um novo relatorio, provavelmente vai ser o select do CRUD (o recover)
        return r;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isFlagAdministrador() {
        return flagAdministrador;
    }

    public void setFlagAdministrador(boolean flagAdministrador) {
        this.flagAdministrador = flagAdministrador;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getAfiliacaoPolitica() {
        return afiliacaoPolitica;
    }
    
    public void setAfiliacaoPolitica(String afiliacaoPolitica) {
        this.afiliacaoPolitica = afiliacaoPolitica;
    }
}
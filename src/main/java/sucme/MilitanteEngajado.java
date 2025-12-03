package sucme;

import java.time.LocalDate;

public class MilitanteEngajado extends Usuario {
    private String uf;
    private String afiliacaoPolitica;
    
    public void atualizarProprioUsuario (int id, String senha) {
        // chamar um metodo parecido com o Update do CRUD
    }
    
    public MilitanteEngajado (String nome, LocalDate dataNascimento, String email, String senha, String cpf, boolean flagAdministrador, String uf, String afiliacaoPolitica) {
//        super(nome, dataNascimento, email, senha, cpf, flagAdministrador);
        this.uf = uf;
        this.afiliacaoPolitica = afiliacaoPolitica;
    }
}
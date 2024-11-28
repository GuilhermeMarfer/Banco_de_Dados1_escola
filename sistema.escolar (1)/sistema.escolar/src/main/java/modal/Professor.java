package modal;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_professor")

public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "pk_id_aluno")
    private int pk_id_aluno;

    private Long id;

    @Column(name = "nome_professor")
    private String nome;

    @Column(name = "email_professor")
    private String email;

    @OneToMany(mappedBy = "professor")
    private Aluno aluno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

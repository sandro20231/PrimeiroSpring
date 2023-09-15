package dom.entidades;

import ch.qos.logback.classic.boolex.GEventEvaluator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="editora")
public class Editora {
    // Campos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="endereco")
    private String endereco;
    //Relacionamento com tabela livro
    // uma editora para varios livros

    // Construtor personalizado

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // construtor super

    public Editora(){

    }

    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // ToString

    @Override
    public String toString() {
        return "Editora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

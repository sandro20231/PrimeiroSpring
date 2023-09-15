package dom.entidades;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="autor")
public class Autor {
    // Campos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;
    @Column(name="nacionalidade")
    private String nacionalidade;
    // Relação com tabela livro
    // um autor para varios livros


    // construtor personalizado

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // construtor super

    public Autor(){

    }

    // Getters e setters

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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // ToString

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}

package dom.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name="livro")
public class Livro {
    // Campos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String titulo;
    @Column(name=" anopublicacao")
    private int anoPublicacao;
    @Column(name="preco")
    private BigDecimal preco;
    //Relação com tabela autor
    // muitos autores para um livro
    @ManyToOne
    @JoinColumn(name="autor_id")
    private Autor autor;
    // Relação com a tabela editora
    // Muitas editoras para um livro

    @ManyToOne
    @JoinColumn(name="editora_id")
    private Editora editora;

    // Construtor personalizado

    public Livro(String titulo, int anoPublicacao, BigDecimal preco, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.autor = autor;
        this.editora = editora;
    }
    //construtor super

    public Livro(){

    }
    // Getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    // ToString

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", preco=" + preco +
                ", autor=" + autor +
                ", editora=" + editora +
                '}';
    }
}

package dom.repositorios;

import dom.entidades.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    List<Livro> findByAnoPublicacao(int ano);
    List<Livro> findByAutor(String autor);
    List<Livro> findByEditora(String editora);

}

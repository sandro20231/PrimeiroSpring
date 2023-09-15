package dom.repositorios;

import dom.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    Autor findByNome(String nome);
}

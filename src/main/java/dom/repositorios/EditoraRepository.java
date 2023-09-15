package dom.repositorios;

import dom.entidades.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {
    Editora findByNome(String nome);
}

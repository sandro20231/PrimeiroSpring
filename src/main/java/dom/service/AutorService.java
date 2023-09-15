package dom.service;

import dom.entidades.Autor;
import dom.repositorios.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public Autor encontrarAutorPorNome(String nome) {
        return autorRepository.findByNome(nome);
    }
}

package dom.service;

import dom.entidades.Livro;
import dom.repositorios.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> encontrarLivrosPorAno(int ano){
            return livroRepository.findByAnoPublicacao(2020);

    }


}

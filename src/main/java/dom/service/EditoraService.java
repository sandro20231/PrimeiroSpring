package dom.service;

import dom.entidades.Editora;
import dom.repositorios.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditoraService {
    @Autowired
    private EditoraRepository editoraRepository;

    public Editora encontrarEditoraPorNome(String nome) {
        return editoraRepository.findByNome(nome);
    }
}

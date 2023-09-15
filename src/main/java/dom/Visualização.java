package dom;

import dom.entidades.Autor;
import dom.entidades.Editora;
import dom.entidades.Livro;
import dom.repositorios.AutorRepository;
import dom.repositorios.EditoraRepository;
import dom.repositorios.LivroRepository;
import dom.service.AutorService;
import dom.service.EditoraService;
import dom.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Visualização {

    @Bean
    public CommandLineRunner executar(@Autowired LivroRepository livros,
                                      @Autowired EditoraRepository editoras,
                                      @Autowired AutorRepository autores,
                                      @Autowired LivroService livro2,
                                      @Autowired EditoraService editora2,
                                      @Autowired AutorService autor2){

        return args ->{
            System.out.println("inserindo autores");
            Autor a1 = new Autor("sandro", "Brasil");
            autores.save(a1);
            Autor a2 = new Autor("kiko", "Brasil");
            autores.save(a2);
            Autor a3 = new Autor("wolf", "EUA");
            autores.save(a3);
            Autor a4 = new Autor("Jack", "EUA");
            autores.save(a4);
            System.out.println("inserindo editoras");
            Editora e1 = new Editora("mentirasedicoes", "rua a, 1");
            editoras.save(e1);
            Editora e2 = new Editora("verdadesedições", "rua b, 2");
            editoras.save(e2);
            Editora e3 = new Editora("trueEdition", "rua a, 1");
            editoras.save(e3);
            Editora e4 = new Editora("falseEdition", "rua b, 2");
            editoras.save(e4);
            System.out.println("insrerindo livros");
            Livro l1 = new Livro("livro1",2023, BigDecimal.valueOf(100), a1, e1);
            livros.save(l1);
            Livro l2 = new Livro("livro2",2022, BigDecimal.valueOf(100), a1 , e2);
            livros.save(l2);
            Livro l3 = new Livro("livro3",2020, BigDecimal.valueOf(100), a2 , e3);
            livros.save(l3);
            Livro l4 = new Livro("livro4", 2020, BigDecimal.valueOf(100),a2,e2);
            livros.save(l4);


            System.out.println("Listando livros");

            List<Livro> ll = livros.findAll();
            System.out.println(ll);

            List<Editora> ee = editoras.findAll();
            System.out.println(ee);

            List<Autor> aa = autores.findAll();
            System.out.println(aa);


           List<Livro>  ll2 = livro2.encontrarLivrosPorAno(2020);
            System.out.println(ll2);
            Editora editora = editoras.findByNome("mentirasedicoes");
           
            System.out.println(editora);




        };
    }

        public static void main(String[] args) {
        SpringApplication.run(Visualização.class, args);
    }
}

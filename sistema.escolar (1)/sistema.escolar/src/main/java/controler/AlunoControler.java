package controler;


import modal.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.AlunoRepository;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControler {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getalunos(){
        return alunoRepository.findAll();
    }
}

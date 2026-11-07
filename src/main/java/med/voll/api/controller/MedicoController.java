package med.voll.api.controller;


import lombok.AllArgsConstructor;
import med.voll.api.domain.medico.Endereco;
import med.voll.api.domain.medico.Medico;
import med.voll.api.repository.MedicoRepository;
import med.voll.api.web.MedicoRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
@AllArgsConstructor

public class MedicoController {


    private final MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody MedicoRequest dto){
        repository.save(new Medico(dto));
    }
}

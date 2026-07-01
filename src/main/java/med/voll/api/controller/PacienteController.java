package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

}

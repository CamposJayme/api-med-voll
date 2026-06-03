package med.voll.api.controller;

import med.voll.api.cliente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println(dados);
    }

}

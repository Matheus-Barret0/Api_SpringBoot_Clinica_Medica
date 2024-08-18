package clinica.api.controller;

import clinica.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class MedicoController {
    //DTO (DATA TRANSFER OBJECT)

    @PostMapping
    public void cadastro(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }
}

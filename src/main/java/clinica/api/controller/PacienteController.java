package clinica.api.controller;


import clinica.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PacienteController {

    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        System.out.println();
    }

}

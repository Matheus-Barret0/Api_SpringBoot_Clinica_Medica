package clinica.api.controller;

import clinica.api.endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {

}

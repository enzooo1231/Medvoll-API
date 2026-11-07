package med.voll.api.web;

import med.voll.api.domain.medico.Especialidade;

public record MedicoRequest(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}

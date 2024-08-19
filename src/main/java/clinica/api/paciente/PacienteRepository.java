package clinica.api.paciente;

import clinica.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}

package entities

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "tb_paciente")
data class Paciente(
    @Id
    @GeneratedValue
    val idPaciente: Long?,
    val nome: String,
    val documento: String,
    val dataNascimento: LocalDate,
    val nomeDaMae: String
)

package entities

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_recepcionista")
data class Recepcionista(
    @Id
    @GeneratedValue
    val idRecepcionista: Long,
    val nome: String,
    val documento: String,
    val dataNascimento: LocalDate
)

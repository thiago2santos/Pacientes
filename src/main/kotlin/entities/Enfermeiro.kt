package entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_enfermeiro")
data class Enfermeiro(
    @Id
    @GeneratedValue
    val id_enfermeiro: Long,
    val nome: String,
    val coren: String,
    val dataNascimento: Date,
)

package entities

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tb_ficha_atendimento")
data class FichaAtendimentoAmbulatorial(
    @Id
    @GeneratedValue
    val idFichaAtendimento: Long,
    val dataAbertura: Date,
//    @ManyToOne
//    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    @Transient
    val paciente: Paciente,
    @Transient
    var triagem: MutableSet<Triagem>
    )

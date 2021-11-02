package entities

import enums.ClassificacaoDeRisco
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "tb_triagem")
data class Triagem(
    @Id
    @GeneratedValue
    val idTriagem: Long,
    val queixaPrincipal: String,
    val historiaBreve: String,
    val observacaoObjetiva: String,
    @Transient
    val sinaisVitais: SinaisVitais,
    @Transient
    val classificacaoDeRisco: ClassificacaoDeRisco,
    val drogas: String,
    val alergias: String,
    val doencasPreExistentes: String,
    val condutaInicial: String,
    val reavaliacao: String,
    val horaReavaliacao: Instant,
    @Transient
    val enfermeiro: Enfermeiro,
//    @ManyToOne
//    @JoinColumn(name = "idFichaAtendimento", referencedColumnName = "idFichaAtendimento")
    @Transient
    val fichaAtendimento: FichaAtendimentoAmbulatorial
)

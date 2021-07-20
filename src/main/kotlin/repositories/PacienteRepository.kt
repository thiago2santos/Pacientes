package repositories

import entities.Paciente
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.*

@Repository
interface PacienteRepository : CrudRepository<Paciente, Long> {
    override fun findAll(): MutableIterable<Paciente>
    override fun findById(id: Long): Optional<Paciente>
    override fun <S : Paciente?> save(entity: S): S
    override fun <S : Paciente?> update(entity: S): S
    override fun delete(entity: Paciente)
}
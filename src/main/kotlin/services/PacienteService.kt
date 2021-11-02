package services

import entities.Paciente
import repositories.PacienteRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class PacienteService(val pacienteRepository: PacienteRepository) {

    fun findAll(): MutableIterable<Paciente> {
        return pacienteRepository.findAll()
    }

    fun find(idPaciente: Long): Optional<Paciente> {
        return pacienteRepository.findById(idPaciente)
    }

    fun save(paciente: Paciente): Paciente {
        return pacienteRepository.save(paciente)
    }

    fun update(paciente: Paciente): Paciente {
        return pacienteRepository.update(paciente)
    }

    fun delete(idPaciente: Long) {
        val paciente = pacienteRepository.findById(idPaciente)
        paciente.ifPresent { paciente -> pacienteRepository.delete(paciente) }
    }

}
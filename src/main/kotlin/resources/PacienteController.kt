package resources

import entities.Paciente
import io.micronaut.http.annotation.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import services.PacienteService
import java.net.URI
import java.util.*


@Controller("/pacientes")
class PacienteController(
    val pacienteService: PacienteService
) {

    @Get
    fun findAll(): ResponseEntity<MutableIterable<Paciente>?> {
        val list = pacienteService.findAll()
        return ResponseEntity.ok().body(list)
    }

    @Get("/{idPaciente}")
    fun find(idPaciente: Long): ResponseEntity<Optional<Paciente>> {
        val paciente = pacienteService.find(idPaciente)

        if (paciente.isPresent)
            return ResponseEntity.ok().body(paciente)
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(paciente)
    }

    @Post
    fun save(@RequestBody paciente: Paciente): ResponseEntity<Paciente> {
        val obj = pacienteService.save(paciente)
        val location = URI.create(String.format("/pacientes/%s", obj.idPaciente))
        return ResponseEntity.created(location).body(obj)
    }

    @Put
    fun update(@RequestBody paciente: Paciente): ResponseEntity<Paciente> {
        val obj = pacienteService.update(paciente)
        return ResponseEntity.ok().body(obj)
    }

    @Delete
    fun delete(@RequestBody paciente: Paciente) {
        pacienteService.delete(paciente)
    }
}
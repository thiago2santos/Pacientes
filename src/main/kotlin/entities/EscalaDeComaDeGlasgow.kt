package entities

import enums.AberturaOcular
import enums.RespostaMotora
import enums.RespostaVerbal

data class EscalaDeComaDeGlasgow(
    val aberturaOcular: AberturaOcular,
    val respostaVerbal: RespostaVerbal,
    val respostaMotora: RespostaMotora,
)

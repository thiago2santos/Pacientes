package entities

import enums.EscalaIntensidadeDaDor

data class SinaisVitais(
    val pressaoArterial: PressaoArterial,// mmHg - força do sangue contra as paredes da arteria
    val temperaturaCorporal: Double,//graus centigrados
    val frequenciaCardiaca: Int,//batimentos por minutos - Onda de Pressão do Sangue Contra a Parede Arterial - Sentida pelo Toque
    val saturacaoDeOxigenio: Int,
    val frequenciaRespiratoria: Int, //movimentos respiratorios por minuto (mrm)
    val dor: EscalaIntensidadeDaDor
)

package br.com.connectrescuedanimal.demo.model

import jdk.nashorn.internal.runtime.Debug.id

data class Animals(
    val id: Long,
    val genre: String,
    val breed: String,
    val type: String,
    val status: SituationStatus = SituationStatus.DESABRIGADO,
    val protectress: Protectress
)
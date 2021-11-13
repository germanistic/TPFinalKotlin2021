package com.example.tp_finalkotlin_2021

//Alumno : Eduardo German Ruiz Diaz
//Profesor : Roberto Abadia
//Materia : Programación 3 - Kotlin


//Clase y atributos

open class Procesador(private var marca: String, var modelo: String, var cores: Int) {


    //Metodo ToString
    override fun toString(): String {
        return "Marca: $marca - Modelo: $modelo - Cores: $cores"
    }

}
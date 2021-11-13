package com.example.tp_finalkotlin_2021

//Alumno : Eduardo German Ruiz Diaz
//Profesor : Roberto Abadia
//Materia : Programación 3 - Kotlin

abstract class Dispositivo{var nombreProducto:String =""
    var fabricante:String =""
    var procesador: Procesador
    var tipo:String = ""
    var mother:String=""
    var hd:Int=0
    var ram:Int=0

    //Constructor con todos los atributos
    constructor(nombreProducto:String,fabricante: String, procesador: Procesador, tipo: String, mother: String, hd: Int, ram: Int) {
        this.nombreProducto=nombreProducto
        this.fabricante = fabricante
        this.procesador = procesador
        this.tipo = tipo
        this.mother = mother
        this.hd = hd
        this.ram = ram
    }

    //Sobre escritura de constructor EJ: Venta de una consola de juegos
    constructor(nombreProducto:String,fabricante: String, procesador: Procesador, tipo: String,hd: Int, ram : Int) {
        this.nombreProducto=nombreProducto
        this.fabricante = fabricante
        this.procesador = procesador
        this.tipo = tipo
        this.hd=hd
        this.ram=ram
    }

    //Metodos

    open fun prendeEquipo(){
        print("Bip-Bip")
    }
    open fun sistemaOperativo(){
        print("Shuuuuuing")

    }

    open fun  msnProcesador(modelo: String) {
        print("10101110101011101010")
    }
}
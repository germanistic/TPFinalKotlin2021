package com.example.tp_finalkotlin_2021

//Alumno : Eduardo German Ruiz Diaz
//Profesor : Roberto Abadia
//Materia : Programación 3 - Kotlin


//Clase Consola con Herencia y atributos de Dispositivo como clase Padre.

class Consola() : Dispositivo("","",Procesador("","",0),"",0,0){

    //Constructor del objeto Consola

    constructor(nombreProducto:String,fabricante: String,procesador: Procesador, tipo: String,hd: Int, ram : Int) : this() {
        this.nombreProducto=nombreProducto
        this.fabricante = fabricante

        this.procesador = procesador
        this.tipo = tipo
        this.hd=hd
        this.ram=ram

    }

    //Herencia de Metodos y sobre escritura

    fun prendeEquipo(fabricante: String) {
        if(fabricante.isEmpty()){
            println("Olvido ingresar el fabricante")
        }
        if (fabricante.equals("sony",ignoreCase = true)){
            println("Sony PlayStation 5 la mejor Consola")
        }
        if (fabricante.equals("xbox",ignoreCase = true)){
            println("XBox One la Mejor Consola")
        }

    }

    fun sistemaOperativo(fabricante: String) {
        if(fabricante.isEmpty()){
            println("Sistema Operativo: Olvido ingresar el fabricante")
        }
        if (fabricante.equals("sony",ignoreCase = true)){
            println("Sistema Operativo: Sony Entertaiment")
        }
        if (fabricante.equals("xbox",ignoreCase = true)){
            println("Sistema Operativo: Microsoft")}

    }


    override fun msnProcesador(modelo: String) {
        if(modelo.isEmpty()){
            println("Olvido ingresar el fabricante")
        }
        if (modelo.equals("sony",ignoreCase = true)){
            println("Sony PlayStation vuela !!!")
        }
        if (modelo.equals("xbox",ignoreCase = true)){
            println("Microsoft Game vuela !!!")
            println("-------------------------------")}

    }

    //Metodo ToString

    override fun toString(): String {
        println("\n-------------------------------")
        println("|      Dispositivo $tipo    |")
        println("-------------------------------\n")
        return "Producto:$nombreProducto\nFabricante: $fabricante\nProcesador-> $procesador\nDisco Rigido: $hd TB SSD\nMemoria Ram: $ram DDR6\n-------------------------------\n"
    }
}
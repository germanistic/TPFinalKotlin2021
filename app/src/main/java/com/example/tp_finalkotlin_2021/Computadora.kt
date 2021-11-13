package com.example.tp_finalkotlin_2021

//Alumno : Eduardo German Ruiz Diaz
//Profesor : Roberto Abadia
//Materia : Programación 3 - Kotlin


//Clase Computadora con Herencia y atributos de Dispositivo como clase Padre.

class Computadora():Dispositivo("","",Procesador("","",0),"","",0,0) {

    //Constructor del objeto Computadora

    constructor(nombreProducto:String, fabricante: String, procesador:Procesador, tipo: String, mother:String, hd: Int, ram : Int) : this(){
        this.nombreProducto=nombreProducto
        this.fabricante=fabricante
        this.procesador=procesador
        this.tipo=tipo
        this.mother=mother
        this.hd=hd
        this.ram=ram

    }

    //Metodos

    override fun prendeEquipo() {
        println("Bip Bip.....mas rapido no puede encender este equipo")
    }
    fun prendeEquipo(nombreProducto: String){
        if(nombreProducto.isEmpty()){
            println("Producto: Olvido ingresar el producto")
        }
        if (nombreProducto.equals("pc",ignoreCase = true)){
            println("Una PC Desktop es mas rapida y potente que una laptop")
        }
        if (nombreProducto.equals("Laptop",ignoreCase = true)){
            println("Una Laptop de alta gama se encuentra a la par de una PC Desktop Master Race")}

    }
    override fun sistemaOperativo() {
        println("Recomendamos utilizar un Sistema operativo de licencia Original o Software GNU - Linux")
    }

    override fun msnProcesador(modelo: String) {
        println("Todo sale mejor con un procesador $modelo")

    }
    fun msnProcesador(modelo:String,cores: Int) {
        println("Todo sale mejor con un procesador $modelo y todo el poder de sus $cores cores" )

    }

    //Metodo ToString

    override fun toString(): String {
        if (tipo.equals("pc",ignoreCase = true)){
            println("\n-------------------------------")
            println("|     Dispositivo $tipo          |")
            println("-------------------------------\n")
        }
        if (tipo.equals("Laptop",ignoreCase = true)){
            println("\n-------------------------------")
            println("|     Dispositivo $tipo      |")
            println("-------------------------------\n")}
        return "Producto:$nombreProducto\nFabricante: $fabricante\nProcesador-> $procesador\nDisco Rigido: $hd TB SSD\nMotherBoard: $mother\nMemoria Ram: $ram DDR6\n-------------------------------\n"

    }
}
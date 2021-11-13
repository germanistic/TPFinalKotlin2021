package com.example.tp_finalkotlin_2021

//Alumno : Eduardo German Ruiz Diaz
//Profesor : Roberto Abadia
//Materia : Programación 3 - Kotlin


//Clase principal donde corren las instrucciones del programa

fun main() {

    //Generamos un objeto Consola(de Juegos) , con los atributos y un constructor a medida

    val eq=Consola("PlayStation","Sony", Procesador("AMD","Ryzen Zen 2 ",8),"Consola",2,16)

    //Se imprime con el metodo toString() de la clase ANY de kotlin
   // print(eq)

    //Se llama a los metodos enviando un parametro
    //eq.prendeEquipo(eq.fabricante)
    //eq.sistemaOperativo(eq.fabricante)
    //eq.msnProcesador(eq.fabricante)

    //Generamos un objeto Procesador y otro PC o bien podria ser Laptop , con los atributos y un constructor a medida

    val ppc=Procesador("Intel","I9 ",16)
    val pc=Computadora("PC Master Race","Dell", ppc,"PC","Asus P855 XT",2,64)

    //Se imprime con el metodo toString() de la clase ANY de kotlin
    print(pc)

    //Se llama al metodo sin enviar parametros
    //pc.prendeEquipo()
    //pc.sistemaOperativo()

    //Se llama a los metodos enviando un parametro
    //pc.msnProcesador(ppc.modelo)

    //Sobrescritura de Metodo enviando parametro
    //pc.prendeEquipo(pc.tipo)

    //Generamos un objeto Procesador y otro PC o bien podria ser Laptop , con los atributos y un constructor a medida

    val pnt=Procesador("Intel","I7 ",8)
    val nt=Computadora("Laptop Alta Gama","Dell",pnt,"laptop","Asus P855 XT",2,64)

    //Se imprime con el metodo toString() de la clase ANY de kotlin
   // print(nt)


    //Se llama al metodo sin enviar parametros
    nt.prendeEquipo()
    nt.sistemaOperativo()

    //Sobrescritura de Metodo enviando parametro
    nt.prendeEquipo(nt.tipo)
    nt.msnProcesador(pnt.modelo,pnt.cores)



}
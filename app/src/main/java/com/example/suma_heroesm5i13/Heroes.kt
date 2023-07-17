package com.example.suma_heroesm5i13

class Heroes {
}

data class Superhero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    var photo: String)

fun ingresarSuperheroes(): List<Superhero> {
    val superheroes = mutableListOf<Superhero>()

    do {
        println("Ingrese el nombre del superhéroe (o escriba 'salir' para terminar):")
        val nombre = readLine()?.trim() ?: ""
        if (nombre.equals("salir", ignoreCase = true)) {
            break
        }

        println("Ingrese el nombre del publicador:")
        val publisher = readLine()?.trim() ?: ""

        println("Ingrese el nombre real del superhéroe:")
        val realName = readLine()?.trim() ?: ""

        println("Ingrese el enlace de la foto:")
        val photo = readLine()?.trim() ?: ""

        val superhero = Superhero(nombre, publisher, realName, photo)
        superheroes.add(superhero)
    } while (true)

    return superheroes
}

fun main() {
    val superheroes = ingresarSuperheroes()

    println("Superhéroes registrados:")
    superheroes.forEach {
        println("Nombre: ${it.superhero}, Publicador: ${it.publisher}, Nombre Real: ${it.realName}, Foto: ${it.photo}")
    }
}

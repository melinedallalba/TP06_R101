package tp06.activite.c

fun main() {
    println("=== Organisation du Road Trip ===")

    val etapes = arrayOf("Paris", "Lyon", "Marseille", "Nice")

    println("Étapes initiales :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }

    // Modification : changement d'avis sur une destination
    println("\nChangement de programme : on remplace Marseille par Montpellier...")
    for (i in 0 until etapes.size) {
        if (etapes[i] == "Marseille") {
            etapes[i] = "Montpellier"
        }
    }

    // Supposons que Nice soit trop chère → on la marque comme "Annulée"
    println("Finalement, Nice est trop chère. On annule cette étape.")
    for (i in 0 until etapes.size) {
        if (etapes[i] == "Nice") {
            etapes[i] = "(Annulé) Nice"
        }
    }

    // Affichage final
    println("\nItinéraire mis à jour :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }

    println("\nRoad trip prêt ! Il ne reste plus qu’à faire les valises 🎒")
}

// Signature première fonction : .................................
// Signature deuxième fonction : .................................

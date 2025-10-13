package tp06.activite.c

fun main() {
    //  Le titre et la création du tableau : laissés dans fun main()
    println("=== Organisation du Road Trip ===")

    val etapes = arrayOf("Paris", "Lyon", "Marseille", "Nice")

    // Afficher les étapes initiales entre Paris et Nice : laissé dans fun main()
    println("Étapes initiales :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }

    // Modification : changement d'avis sur une destination
    // Fonction 1 : Modifier une des valeurs du tableau et la remplacer
    // Signature première fonction : fun modifierEtapes(etapes : array<String>) : String
    println("\nChangement de programme : on remplace Marseille par Montpellier...")
    for (i in 0 until etapes.size) {
        if (etapes[i] == "Marseille") {
            etapes[i] = "Montpellier"
        }
    }

    // Supposons que Nice soit trop chère → on la marque comme "Annulée"
    // Fonction 2 : Annuler une des étapes
    // Signature deuxième fonction : fun annulerEtapes(etapes : array<String>) : String
    println("Finalement, Nice est trop chère. On annule cette étape.")
    for (i in 0 until etapes.size) {
        if (etapes[i] == "Nice") {
            etapes[i] = "(Annulé) Nice"
        }
    }

    // Affichage final suite à toutes les modifications : laissé dans fun main ()
    println("\nItinéraire mis à jour :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }

    println("\nRoad trip prêt ! Il ne reste plus qu’à faire les valises 🎒")
}




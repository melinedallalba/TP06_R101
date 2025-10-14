package tp06.activite.c

// import kotlin.text.get
// import kotlin.text.set

fun main() {
    //  Le titre et la création du tableau : laissés dans fun main()
    println("=== Organisation du Road Trip ===")

    val etapes = arrayOf("Paris", "Lyon", "Marseille", "Nice")

    // Afficher les étapes initiales entre Paris et Nice : laissé dans fun main()
    println("Étapes initiales :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }

    modifierEtapes(etapes, numeroEtape = 2, nouvelleEtape = "Montpellier")
    annulerEtapes(etapes)
    afficherRoadTripFinal(etapes)

}

    // Modification : changement d'avis sur une destination
    // Fonction 1 : Modifier une des valeurs du tableau et la remplacer
    // Signature première fonction : fun modifierEtapes(etapes : Array<String>)
    fun modifierEtapes(etapes: Array<String>, numeroEtape: Int, nouvelleEtape: String) {
        println("\nChangement de programme : on remplace Marseille par Montpellier...")
        etapes[numeroEtape] = nouvelleEtape
    }

    // Supposons que Nice soit trop chère → on la marque comme "Annulée"
    // Fonction 2 : Annuler une des étapes
    // Signature deuxième fonction : fun annulerEtapes(etapes : array<String>)
fun annulerEtapes(etapes: Array<String>) {
    println("Finalement, Nice est trop chère. On annule cette étape.")
    for (i in 0 until etapes.size) {
        if (etapes[i] == "Nice") {
            etapes[i] = "(Annulé) Nice"
        }
    }
}

fun afficherRoadTripFinal(etapes: Array<String>) {
    // Affichage final suite à toutes les modifications : laissé dans fun main ()
    println("\nItinéraire mis à jour :")
    for (i in 0 until etapes.size) {
        println(" - Étape ${i + 1} : ${etapes[i]}")
    }
    println("\nRoad trip prêt ! Il ne reste plus qu’à faire les valises 🎒")
}

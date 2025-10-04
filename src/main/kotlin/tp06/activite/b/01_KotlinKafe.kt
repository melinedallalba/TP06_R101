package tp06.activite.b

// Quel est le but du programme principal ?
// ...

fun main() {
    println("=== Bienvenue au Kotlin Café ===")
    val commandes = arrayOf("Espresso", "Latte", "Cappuccino", "Thé Matcha", "Chocolat Chaud")
    afficherCommandes(commandes)
}

fun afficherCommandes(commandes: Array<String>) {
    // 0 until commandes.size décrit un intervalle allant de ... à ...
    // Je pourrais écrire cet objet de type ........ par ........... ou par ...............
    for (i in 0 until commandes.size) {
        // commandes[i] permet de récupérer la commande n° .....
        println("Commande ${i + 1} : ${commandes[i]} en préparation...")
    }

    println("Toutes les boissons sont prêtes ! Bonne dégustation !")
}

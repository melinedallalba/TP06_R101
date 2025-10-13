package tp06.activite.b

// Quel est le but du programme principal ?
// Créer un tableau avec les différentes valeurs (Expresso, Latte, etc.)
// Puis les afficher

fun main() {
    println("=== Bienvenue au Kotlin Café ===")
    val commandes = arrayOf("Espresso", "Latte", "Cappuccino", "Thé Matcha", "Chocolat Chaud")
    afficherCommandes(commandes)
}

fun afficherCommandes(commandes: Array<String>) {
    // 0 until commandes.size décrit un intervalle allant de 0 à commandes.size-1
    // Je pourrais remplacer l'écriture de cet objet de type Array<String> par .indices ou par .index
    for (i in 0 until commandes.size) {
        // commandes[i] permet de récupérer la commande n°i, correspondant à sa place dans le tableau
        println("Commande ${i + 1} : ${commandes[i]} en préparation...")
    }

    println("Toutes les boissons sont prêtes ! Bonne dégustation !")
}

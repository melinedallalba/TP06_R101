package tp06.activite.b

// Quel est le but du programme principal ?
// Créer un tableau avec différentes valeurs correspondant à des boissons (expresso, Latte, etc.)
// Afficher le résultat de ce tableau
// Puis remplacer Latte par Frappé
// Et enfin afficher le résultat suite à la modification

fun main() {
    println("=== Bienvenue au Kotlin Café ===")
    val boissons = arrayOf("Espresso", "Latte", "Cappuccino", "Thé Matcha", "Chocolat Chaud")
    afficherCarte(boissons)
    modifieCarte(boissons, 2, "Frappé")
    afficherCarte(boissons)
    // Le programme modifie bien la carte des boissons alors que la variable boissons est
    // déclarée avec le mot clé "val". Peux-tu expliquer pourquoi cela est possible ?
    // Le tableau est certes immuable, mais les variables à l'intérieur peuvent référer d'autres objets.
    // et la variable val est définie par arrayOf
}

fun modifieCarte(boissons: Array<String>, numeroBoisson: Int, nouvelleBoisson: String) {
    boissons[numeroBoisson-1] = nouvelleBoisson
}

fun afficherCarte(boissons: Array<String>) {
    println("À la carte...")
    for (boisson in boissons) {
        println(boisson)
    }
    println("Toutes les boissons sont disponibles ! Bonne dégustation !")
}

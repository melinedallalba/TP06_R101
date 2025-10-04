package tp06.activite.b

// Quel est le but du programme principal ?
// ...

fun main() {
    println("=== Bienvenue au Kotlin Café ===")
    val boissons = arrayOf("Espresso", "Latte", "Cappuccino", "Thé Matcha", "Chocolat Chaud")
    afficherCarte(boissons)
    modifieCarte(boissons, 2, "Frappé")
    afficherCarte(boissons)
    // Le programme modifie bien la carte des boissons alors que la variable boissons est
    // déclarée avec le mot clé "val". Peux-tu expliquer pourquoi cela est possible ?
    // ...
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

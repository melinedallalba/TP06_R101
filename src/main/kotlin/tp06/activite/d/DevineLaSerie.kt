package tp06.activite.d

import kotlin.String

fun main() {
    // But programme : deviner le titre d'une série à partir de lettres mélangées
    // Créer un tableau recensant les séries
    val tableauSerie = arrayOf(
        "Breaking Bad",
        "Stranger Things",
        "Dark",
        "The Crown",
        "Black Mirror",
        "Narcos",
        "Peaky Blinders",
        "The Witcher")
    // Créer un tableau recensant les indices
    val tableauIndice = arrayOf(
        "Prof de chimie devient… entrepreneur.",
        "Mystères dans une petite ville des années 80.",
        "Voyages temporels en Allemagne.",
        "Famille royale britannique.",
        "Technologies et dystopies.",
        "Cartels et agents.",
        "Gangsters de Birmingham.",
        "Monstres et sorciers." )
    // Faire :
    do {
        println("« === Devine la série === »")
        // - Choisir aléatoirement une série
        val serie = tableauSerie.indices.random()
        val nomSerie = tableauSerie[serie]

        // - Récupérer et afficher les lettres du titre
        val nomSerieMelange = recupererNomSerieMelange(nomSerie)
        println(
        """
        Les lettres du titre ont été mélangées.
        A toi de deviner de quelle série il s'agit.
        Tu as 3 essais, mais pas de panique, tu auras un indice après ton premier essai.
        
        $nomSerieMelange
        
        """.trimIndent())

        // - Faire saisir le joueur et récupérer sa réponse
        var propositionJoueur = recupererPropositionJoueur()

        // - Après 1er essai : afficher indice
       if (propositionJoueur != nomSerie) {
           essai1(tableauIndice, serie)
       }

        // - Limiter à 3 essais
        val nbEssaisMax = 3
        var compteurEssais = 2

        // - Récupérer 2ème et 3ème réponse (s'il y a)
        while (propositionJoueur != nomSerie && compteurEssais <= nbEssaisMax) {
            println("== Essai n°$compteurEssais == ")
            propositionJoueur = recupererPropositionJoueur()
            compteurEssais++
        }

        // - Afficher Perdu si le joueur n'a pas trouvé avant les 3 essais
        // - Afficher Gagné sinon
        if (propositionJoueur != nomSerie) {
            println("Dommage ! Tu as perdu. " +
                    "Il s'agissait de $nomSerie")
        } else (println("Bravo ! Tu as gagné"))

        println("Veux-tu rejouer ? (o/n)")

    // Tant que le joueur veut rejouer
    } while (readln() == "o")


}

fun recupererPropositionJoueur() : String {
    println("= De quelle série s'agit-il ? = ")
    return readLine().toString()

}

// Donner un indice à partir du 1er essai
fun essai1 (
    tableauIndice : Array<String>,
    serie : Int) {

    val indice = tableauIndice[serie]

    println(
        """
        Non, ce n'est pas la bonne série ! 
        Voici un petit indice :
         
        $indice
        
        Il te reste 2 essais
        """.trimIndent())
}


// Fonction qui mélange les lettres du titre
fun recupererNomSerieMelange(nomSerie: String): String {
    val nomSerieCommeTableau = nomSerie.toCharArray()
    nomSerieCommeTableau.shuffle()
    return nomSerieCommeTableau.concatToString()
    // .toCharArray() : convertis en un Char au sein du tableau
    // .shuffle() : mélange les lettres
    // .concatToString() : prends toutes les infos de mon tableau et en fait une chaine de caractères
}
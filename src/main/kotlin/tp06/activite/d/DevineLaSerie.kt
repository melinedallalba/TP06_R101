package tp06.activite.d

fun main() {
    // But programme : deviner le titre d'une série à partir de lettres mélangées
    // Présenter les règles du jeu
    // Faire :
        // - Choisir aléatoirement une série
        // - Récupérer nom série
        // - Mélanger les lettres du titre
        // - Récupérer et afficher les lettres du titre
        // - Faire saisir le joueur et récupérer sa réponse
        // - Limiter à 3 essais
        // - Après 1er essai : afficher indice
        // - Récupérer 2ème et 3ème réponse (s'il y a)
        // - Afficher Gagné si le joueur a trouvé avant les 3 essais
        // - Afficher la réponse sinon
    // Tant que le joueur veut rejouer
}

fun getTexteMelange(texte: String): String {
    val texteCommeTableau = texte.toCharArray()
    texteCommeTableau.shuffle()
    return texteCommeTableau.concatToString()
    // .toCharArray() : convertis en un Char au sein du tableau
    // .shuffle() : mélange les lettres
    // .concatToString() : prends toutes les infos de mon tableau et en fait une chaine de caractères
}
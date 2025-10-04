package tp06.activite.d

fun main() {
    // TODO
}

fun getTexteMelange(texte: String): String {
    val texteCommeTableau = texte.toCharArray()
    texteCommeTableau.shuffle()
    return texteCommeTableau.concatToString()
}
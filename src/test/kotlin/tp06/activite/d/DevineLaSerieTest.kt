package tp06.activite.d

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DevineLaSerieTest {
    @Test
    fun testGetTexteMelange() {
        // Etant donné un texte
        val unTexte ="Un mot"
        // Quand on melange
        val resultat = getTexteMelange(unTexte)
        println(resultat)
        // les deux textes sont différents
        assertNotEquals(unTexte, resultat)
        // mais ils ont la même taille
        assertEquals(unTexte.length, resultat.length)
        // Et chaque lettre du résultat est dans le texte initial
        for (c in resultat) {
            assertTrue(unTexte.contains(c))
        }
        // Et vice versa
        for (c in unTexte) {
            assertTrue(resultat.contains(c))
        }
    }

}
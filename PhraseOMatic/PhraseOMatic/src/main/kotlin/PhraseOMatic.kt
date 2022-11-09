import kotlin.random.*

fun main (args: Array<String>) {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "Dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "alignet", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val ArraySize1 = wordArray1.size
    val ArraySize2 = wordArray2.size
    val ArraySize3 = wordArray3.size

    val rand1 = Random.nextInt(0, ArraySize1)
    val rand2 = Random.nextInt(0, ArraySize2)
    val rand3 = Random.nextInt(0, ArraySize3)

    println(rand1)
    println(rand2)
    println(rand3)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)

}
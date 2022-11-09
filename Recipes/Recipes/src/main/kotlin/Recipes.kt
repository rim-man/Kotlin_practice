data class Recipes(val title:String,
                    val mainIngredient: String,
                    val isVegetarian:Boolean = false,
                    val  difficulty:String = "Easy") {}
    class Mushroom(val size: Int, val isMagic: Boolean) {
        constructor (isMagic_param: Boolean): this (0, isMagic_param) {
            // Код выполняемый при вызове вторичного окнструктора
        }
    }

fun findRecipes(title: String = "",
                mainIngredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = ""): Array<Recipes> {
    //Код поиска рецептов
return arrayOf(Recipes(title,mainIngredient,isVegetarian, difficulty))}

fun addNumber(a:Int, b:Int):Int {
    return a + b
}

fun addNumber(a:Double, b: Double):Double {
    return a + b
}

fun givMeRecipe(value: Int): Recipes {
    when(value) {
        1 -> return Recipes("first", "Chiken")
        2-> return Recipes("Kartoshka", "Patato")
        else -> return Recipes("UNKOWN", "SHIT")
    }
}

fun main(args:Array<String>) {
    val r1 = Recipes("Thai Curry", "Chiken")
    val r2 = Recipes(title = "Thai Curry", mainIngredient = "Chiken")
    val r3 = r1.copy(title = "Chiken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toStriing: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (chek, mainThing, isVegeterian, diddiculty) = givMeRecipe(1)

    println("title is $chek and vegeterian is $isVegeterian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
    println(addNumber(2,5))
    println(addNumber(1.6, 7.3))




}



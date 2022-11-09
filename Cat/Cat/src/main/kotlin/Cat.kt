class Cat(var name: String? = null) {
    fun Meow() {
        println("Meow!")
    }
}


fun main(args:Array<String>) {
    var myCat = arrayOf(Cat("Misty"), null, Cat("Socks"))
    for (cat in myCat) {
        print ("${cat?.name}:")
        cat?.Meow()
    }



    }


interface Roamable {
    fun roam()
}
abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10


    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("The Animal is roaming")
    }
    fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "Grass"
    override val habitat = "Water"

    override fun makeNoise() {
        println("Grunt! Grunt")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

    abstract class Canine: Animal() {
        override fun roam() {
            println("The Canine is roaming")
        }
    }

    class Wolf: Canine() {
        override val image = "wolf.png"
        override val food = "meat"
        override val habitat = "forest"

        override fun makeNoise() {
            println("Hoooowl!")
        }

        override fun eat() {
            println("The Wolf is eating $food")
        }
    }
class Vehicle: Roamable {
    override fun roam() {
        println("The Vehicle is roaming ")
    }
}
    class Vet {
        fun giveShot(animal: Animal) {
            //Code to do something medical
            animal.makeNoise()
        }
    }

    fun main(args: Array<String>) {

        val hippo = Hippo()
        val wolf = Wolf()
        val animal = arrayOf(Hippo(), Wolf())
        for (item in animal) {
            item.roam()
            item.eat()
        }
        val roamables = arrayOf(Hippo(), Wolf(),Vehicle(),Hippo())
        for (item in roamables) {
            item.roam()
            if (item is Animal) {
                item.eat()
            }
        }


    }




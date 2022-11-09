fun main (args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoices = getUserChoise(options)
    val userChoice = getGameChoice(userChoices)
    printResult (userChoice, gameChoice)
}

fun getGameChoice (optionsParam: Array<String>): String {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoise (optionsParam: Array<String>):Array<String> {
    var isValidChoice = false
    var userChoice = emptyArray<String>()
    //Выполнять цыкл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print (" $item")
        print(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        if (userInput != null) {
            val userCases = userInput.split(' ').map(String::capitalize).toTypedArray()
            isValidChoice = userCases.isNotEmpty()
            //Проверить пользовательский ввод
            for (userCase in userCases) {
                isValidChoice = isValidChoice && (userCase in optionsParam)
            }
            if (isValidChoice) {
                userChoice = userCases
            }
        }

        //Если выбран недопустимый вариант - сообщить пользователю
        if (!isValidChoice) println ("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoise:String, gameChoice:String) {
    val result: String
    //Определить результат
    if (userChoise == gameChoice) result = "Tie!"
    else if ((userChoise == "Rock" && gameChoice == "Scissors") ||
            (userChoise == "Paper" && gameChoice == "Rock") ||
            (userChoise == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    //Вывксти результат
    print ("you choise $userChoise. I chose $gameChoice. $result")
}
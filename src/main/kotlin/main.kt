fun main(args: Array<String>) {
    println("Welcome! What is the password?")
    var login = readLine()
    if (login == "1234") {
        println("Ok")

        command()
    } else {
        println("Wrong!")
    }
}

fun command() {
    val passwordlist = mutableMapOf(
        "floeber" to "floeberp",
        "flabber" to "flabberp",
        "ik speel de baf" to "pimel"
    )
    println("Type 's' to search. 'v + name of the password' to view the password. 'c + name of the password' to change the password.")
    val floeberp = "floeberp"
    val flabberp = "flabberp"
    val ikspeeldebafp = "ikspeeldebafp"
    while (true) {
        val cmd = readLine()
        when (cmd) {
            "v" -> {

                val name = readLine()
                val password = passwordlist[name]
                println(password)


            }

            "s" -> {
                val result = passwordlist.keys
                println(result)
            }

            "c" -> {
                val name = readLine()!!
                val pwd = readLine()!!
                val oldpwd = passwordlist[name]
                passwordlist[name] = pwd
                println("You have changed you password from $oldpwd to $pwd")
            }
        }
    }
}
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASIC, INTERMEDIARY, HARD }

class User(val name : String)

data class ContentEducation(val name: String, val duration: Int = 60, val level : Level)

data class Formation(val name: User, var contents: ContentEducation)

fun main() {
    
    val user1 = User("Samuel Silva")
    val user2 = User("FalvoJr")
    val user3 = User("DIO")
    
    val formationKotlin = ContentEducation("Kotlin Experience", 40, Level.BASIC)
    val formationAndroid = ContentEducation("Android Formation", 60, Level.INTERMEDIARY)
    val bootCamp = ContentEducation("BootCamp DIO", 120, Level.HARD)
    
    val formation = Formation(user1, formationKotlin)
    
    val formation1 = Formation(user2, formationAndroid)
    
    val formation2 = Formation(user3, bootCamp)

    println("-------CURSERS & USERS---------")
    println("$formation")
    println("$formation1")
    println("$formation2")   
}

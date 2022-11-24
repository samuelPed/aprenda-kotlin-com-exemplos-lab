// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASIC, INTERMEDIARY, HARD }

class User(val id : Int, val name : String)

data class ContentEducation(var name: String, val duration: Int = 60)

data class Formation(val name: String, var contents: List<ContentEducation>) {

    val subscribed = mutableListOf<User>()
    
    fun registration(user: User) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

package application

fun main() {
    val nome = "Arthur"
    val nomeMestre = "Arthur"
    val username = "Sysor"
    val usernameMestre = "Arthur"
    val classe = "Mago"
    val raca = "Elfo"
    val newPlayer = Jogador(nome, username, classe, raca)
    val newGM = Mestre(nomeMestre, usernameMestre)
    println("Bem vindo(a): ${newPlayer.nickname}!")
    newPlayer.useSpell()
    newGM.addExperiencia(newPlayer, 10)
    newGM.addOuro(newPlayer, 3)
    newPlayer.printInfos()

}
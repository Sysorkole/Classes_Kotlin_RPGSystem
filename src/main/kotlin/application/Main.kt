package application

fun main() {
    val nome = "Arthur"
    val nomeMestre = "Arthur"
    val username = "Sysor"
    val usernameMestre = "Arthur"
    val classe = "Mago"
    val raca = "Elfo"
    val newPlayer = Jogador(nome, username, classe, raca)
    val newPlayer2 = Jogador("Pedro", "Pguy", "Guerreiro", "Humano")
    val newGM = Mestre(nomeMestre, usernameMestre)
    println("Bem vindo(a): ${newPlayer.nickname}!")
    println("Bem vindo(a): ${newPlayer2.nickname}!")
    newPlayer.useSpell()
    newGM.addExperiencia(newPlayer, 10)
    newGM.addOuro(newPlayer, 3)
    newGM.addJogador(newPlayer)
    newGM.addJogador(newPlayer2)
    newGM.showJogadores()

}
package application

class Jogador(
    nome: String,
    nickname: String,
    val classe: String,
    val raça: String
): Pessoa(nome, nickname) {
    var level = 1
    var moedasDeOuro = 10
    var pontosDeExperiencia = 0

    fun printInfos(){
        println("Dados do jogador:\n\n${this.nickname}\n${this.raça} ${this.classe} Level ${this.level}" +
                "\n\nMoedas de Ouro: ${this.moedasDeOuro}\nExperiência: ${this.pontosDeExperiencia}\n")

    }

    fun useSpell(){
        if(this.level in 1..2 && this.classe == "Mago") {
                println("${this.nickname}: Dispara Seta de Gelo!")
        }
        else if(this.level in 3..4 && this.classe == "Mago"){
                println("${this.nickname}: Dispara Bola de Fogo!")
        }
        else{
            print("Erro encontrado...")
        }
    }
}

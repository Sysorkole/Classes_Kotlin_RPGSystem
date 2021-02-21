package application

class Mestre(
    nome: String,
    nickname: String
):Pessoa(nome, nickname) {
    fun addExperiencia(jogador: Jogador, valor: Int){
        println("Mestre ${this.nickname}: Adicionando $valor de Experiência ao jogador ${jogador.nome}")
        jogador.pontosDeExperiencia += valor
    }

    fun addOuro(jogador: Jogador, valor: Int){
        println("Mestre ${this.nickname}: Adicionando $valor Moedas de Ouro ao jogador ${jogador.nome}")
        jogador.moedasDeOuro += valor
    }

}
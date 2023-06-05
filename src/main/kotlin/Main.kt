fun main(args: Array<String>) {

    var player1 = 0
    var player2 = 0

    fun updatePlayerOneScore(){
        player1++
        println("\nPlayer 1 Venceu!, Player 1 : $player1, Player2 : $player2\n")
    }

    fun updatePlayerTwoScore(){
        player2++
        println("\nPlayer 2 Venceu!, Player 1 : $player1, Player2 : $player2\n")
    }

    println("Olá amigo!, Seja bem-vindo ao Jokenpo!, quem fizer 5 pontos primeiro, vence o jogo! \n Pressione enter para continuar")
    readlnOrNull()

    while (player1 < 5 || player2 < 5) {

        println("Jogador 1 Insira sua jogada! :\n (Pedra, Papel ou Tesoura)")
        var playerOneResponse = readLine()
        println("Jogador 2 insira sua jogada! :\n (Pedra, Papel ou Tesoura)")
        var playerTwoResponse = readLine()

        var value1 = playerOneResponse?.lowercase()?.trim()
        var value2 = playerTwoResponse?.lowercase()?.trim()

        if (value1 == "pedra") {
            when (value2) {
                "pedra" -> println("\nEmpate!, sem pontos adicionais!")
                "papel" -> updatePlayerTwoScore()
                "tesoura" -> updatePlayerOneScore()
            }
        } else if (value1 == "papel") {
            when (value2) {
                "pedra" -> updatePlayerOneScore()
                "papel" -> println("\nEmpate!, sem pontos adicionais!")
                "tesoura" -> updatePlayerTwoScore()
            }
        } else if (value1 == "tesoura") {
            when (value2) {
                "pedra" -> updatePlayerTwoScore()
                "papel" -> updatePlayerOneScore()
                "tesoura" -> println("\nEmpate!, sem pontos adicionais!")
            }
        }else{
            println("Alguém inseriu um valor inválido!")
        }
    }

    if (player1 == 5){
        println("\nJOGADOR 1 VENCEU, PARABÉNS,\nPlacar: P1 = $player1, P2 = $player2\n FINALIZANDO PROCESSO!")
    }else if (player2 == 5){
        println("\nJOGADOR 1 VENCEU, PARABÉNS,\nPlacar: P1 = $player1, P2 = $player2\n FINALIZANDO PROCESSO!")
    }else{
        println("\nUm erro ocorreu, confira os dados e reinicie o jogo!")
    }
}


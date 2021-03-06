package Concrete

import Abstract.IGameSaleManager
import Entities.Discount
import Entities.Game
import Entities.Gamer

class GameSaleManager:IGameSaleManager {
    override fun Buy(game: Game, gamer: Gamer,discount: Discount) {
        println(gamer.FirstName + ", " + game.Name + " adlı oyunu" + " %" + discount.Discount +" indirimle aldı.")
    }

    override fun Restitute(game: Game, gamer: Gamer,discount: Discount) {
        println(gamer.FirstName + ", " + game.Name + " adlı oyunu iade etti.")
    }

    override fun Sell(game: Game, gamer: Gamer,discount: Discount) {
        println(gamer.FirstName + ", " + game.Name + " adlı oyunu sattı.")
    }

}
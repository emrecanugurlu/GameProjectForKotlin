package Abstract

import Entities.Discount
import Entities.Game
import Entities.Gamer

interface IGameSaleManager {

    fun Buy(game: Game,gamer: Gamer,discount: Discount)
    fun Restitute(game: Game,gamer: Gamer,discount: Discount)
    fun Sell(game: Game,gamer: Gamer,discount: Discount)

}
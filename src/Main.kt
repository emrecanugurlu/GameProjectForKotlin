import Abstract.IGameDiscountManager
import Abstract.IGameSaleManager
import Abstract.IGamerManager
import Concrete.CheckUserManager
import Concrete.GameDiscountManager
import Concrete.GameSaleManager
import Concrete.GamerManager
import Entities.Discount
import Entities.Game
import Entities.Gamer
import java.util.*

fun main() {

    val game = Game(1, "GTA 5", 100)
    val gamer = Gamer(1, "Emre Can", "UĞURLU", "123456789", Date(1999 / 1 / 1))
    val discount = Discount(1, "Büyük Mayıs", 20)

    val gamerManager: IGamerManager = GamerManager(CheckUserManager())
    val gameSaleManager: IGameSaleManager = GameSaleManager()
    val gameDiscountManager: IGameDiscountManager = GameDiscountManager()

    gamerManager.Add(gamer)
    gameSaleManager.Buy(game, gamer,discount)
    gameDiscountManager.Add(discount)




}
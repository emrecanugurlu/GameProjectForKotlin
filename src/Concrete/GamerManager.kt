package Concrete

import Abstract.ICheckUserManager
import Abstract.IGamerManager
import Entities.Gamer

class GamerManager(var _checkUserManager: ICheckUserManager) : IGamerManager {

    override fun Add(gamer: Gamer) {
        if (_checkUserManager.checkUser()) {
            println(gamer.FirstName + " eklendi...")
        }
        else{
            throw Exception("Kullanıcı Doğrulanamadı")
        }
    }

    override fun Delete(gamer: Gamer) {
        println(gamer.FirstName + " silindi...")
    }

    override fun Update(gamer: Gamer) {
        println(gamer.FirstName + " güncellendi...")
    }
}
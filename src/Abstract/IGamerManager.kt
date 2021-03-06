package Abstract

import Entities.Gamer

interface IGamerManager {
    fun Add(gamer: Gamer)
    fun Delete(gamer: Gamer)
    fun Update(gamer: Gamer)
}
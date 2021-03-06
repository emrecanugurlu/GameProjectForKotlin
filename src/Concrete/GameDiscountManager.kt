package Concrete

import Abstract.IGameDiscountManager
import Entities.Discount

class GameDiscountManager:IGameDiscountManager {
    override fun Add(discount: Discount) {
        println(discount.Name + " adlı indirim eklendi.")
    }

    override fun Delete(discount: Discount) {
        println(discount.Name + " adlı indirim silindi.")
    }

    override fun Update(discount: Discount) {
        println(discount.Name + " adlı indirim güncellendi.")
    }
}
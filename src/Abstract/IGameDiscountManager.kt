package Abstract

import Entities.Discount

interface IGameDiscountManager {
    fun Add(discount: Discount)
    fun Delete(discount: Discount)
    fun Update(discount: Discount)
}
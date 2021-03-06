package Concrete

import Abstract.ICheckUserManager

class CheckUserManager : ICheckUserManager {
    override fun checkUser(): Boolean {
        return true
    }

}
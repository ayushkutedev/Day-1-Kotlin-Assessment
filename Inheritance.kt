import java.awt.PageAttributes.MediaType.B1

//Why open?
//In Java all classes can be inherited by default.
//In Kotlin you have to explicitly say open to allow inheritance.

open class A {
    fun A()
    {
        println("A function called")
    }
}

class B : A() {
    fun B() {
        println("B function called")
    }
}

fun main()
{
    var b = B()
    b.A()
}


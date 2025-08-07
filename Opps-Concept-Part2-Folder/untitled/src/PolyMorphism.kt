import javax.print.attribute.standard.Sides
import kotlin.time.Duration

fun main(){
    val circle:Circle = Circle(5.0)
    val Square:Square = Square(4.2)

    println(circle.area())
    println(Square.area())
}


open class shape{
    open fun area(): Double{
        return 0.0
    }
}


class Circle(val radius: Double): shape(){
    override  fun area(): Double{
        return Math.PI * radius*radius
    }
}


class Square(val sides: Double): shape(){
    override  fun area(): Double{
        return sides*sides;
    }
}

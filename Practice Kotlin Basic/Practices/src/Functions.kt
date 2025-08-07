import java.lang.reflect.Type

fun main(){
    var mustang = car(name = "Mustang", type = "Petrol", kmph = 100)
    mustang.derivecar();
    mustang.applybreaks()

    var tractor= car(name = "Swaraj", type = "Disel", kmph = 25)

    tractor.derivecar();
    tractor.applybreaks();
}

class car(var name: String, var type: String, var kmph: Int){
    fun derivecar(){
        println("${name}Im a Driving the car ")
    }

    fun applybreaks(){
        println("$name Apply Breaks")
    }
}
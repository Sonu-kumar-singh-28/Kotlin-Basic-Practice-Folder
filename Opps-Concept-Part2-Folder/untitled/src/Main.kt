fun main(){
    var car1 = car(Name = "Mustang", Speed = 129)
    car1.drivecar();
    car1.speedcar()
}


class car(var Name: String, var Speed: Int){
    fun drivecar(){
        println(" hii Mrs Congratulation  to $Name  Owner")
    }

    fun speedcar(){
        println(" Please Slow Drive the $Name Under ${Speed}")
    }
}
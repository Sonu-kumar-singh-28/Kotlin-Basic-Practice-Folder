fun main(){// main functions
    val result= add(num1 = 1, num2 = 3)
    println(result)

    val  result2= add(num1 = 3, num2 = 34)
    println(result2)

    evenodd(num3 = 2)
    evenodd(101)


    var res =mul(num3 = 3, num1 = 4)
    println(res)


    printmessage(12)
}


fun printmessage(count: Int=2){ // where 2 is the default arguments
    for(i in 1..count){
        println("Hello $i")
    }
}

fun add(num1: Int, num2: Int):Int{
    var sum = num1+num2;
    return sum
}


fun  evenodd(num3: Int){
    var result= if(num3%2==0)"even" else "Odd"
    println(result)
}


fun mul(num1: Int , num3: Int): Int{
    val abs= num3-num1;
    return  abs;
}

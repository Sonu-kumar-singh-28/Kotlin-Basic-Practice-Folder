fun main(){
    var array = arrayOf("one","Two","Three ")
    var array1= arrayOf(1,2,3,4,5);

    for(i in array){
        println(i)
    }


    for(i in array1.withIndex()){
        println(i)
    }

    println(array1[2])

    println(array.get(1)) /// access the array value using index
    println(array1.set(0,100)) // set the value of the particular index
    println(array1[0]) // reassign the value of the index



}
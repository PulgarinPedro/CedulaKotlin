/*fun main() {
    println("Prueba 1"+testMult())
}

fun testMult(){
    val a = 10
    val b = 20
    println("($a x $b)= ${a * b}")
}*/
fun main(){
    println("Prueba 1"+testCalc())
    println("Prueba 2"+testCaclNegative())
}

fun calc(a: Int, b:Int): Int{
    if(a<0 && b<0){
        return 0
    }else{
        return a*b
    }


}

fun testCalc():Boolean{
    val res= calc(20,40)
    val esp= 800
    return (res==esp)
}

fun testCaclNegative():Boolean{
    val res= sum(-2,-2)
    val esp= 0
    return (res==esp)

}

fun mol (dig:Int, Cof:Int):Int{

    return 0
}



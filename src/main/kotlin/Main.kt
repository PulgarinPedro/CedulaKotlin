fun main(){
    println("Prueba 1"+testSum())
    println("Prueba 2"+testSumNegative())
}

fun sum(a: Int, b:Int): Int{
    if(a<0 && b<0){
        return 0
    }else{
        return a+b
    }


}

fun testSum():Boolean{
    val res= sum(2,2)
    val esp= 4
    return (res==esp)
}

fun testSumNegative():Boolean{
    val res= sum(2,-2)
    val esp= 0
    return (res==esp)

}






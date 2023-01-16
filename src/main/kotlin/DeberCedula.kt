fun main(){
    println("testSumProducts"+testSumProducts())
    println("testDifferenceOfTen"+testDifferenceOfTen())
}
fun product(coefficient:Int, digit:Int):Int{
    var res=0
    if((coefficient*digit)>9){
        res+=(coefficient*digit)-9
    }
    if(coefficient*digit<9){
        res+=(coefficient*digit)
    }
    return res
}
val cedula= arrayListOf<Int>(0,1,0,6,9,7,7,5,2)
var sum=0
fun sumProducts(cedula:ArrayList<Int>):Int{
    for((i,v) in cedula.withIndex()){
        if(i%2==0){
            sum+=product(v,2)
        }
        if(i%2!=0){
            sum+=product(v,1)
        }
    }
    return (sum)
}
fun differenceOfTen(data:Int):Int{
    var onenumber=0
    if((sum%10)>0){
        onenumber=10-(sum%10)
    }
    return onenumber
}

fun testSumProducts():Boolean{
    val esp=37
    return sumProducts(cedula)==esp
}

fun testDifferenceOfTen():Boolean{
    val esp=9
    return differenceOfTen(37)==esp
}







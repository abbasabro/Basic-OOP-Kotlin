

fun main(args:Array<String>){

    println("Enter Number 1")
    var str2= readLine()!!
    var num1:Int=str2.toInt()

    println("Enter Number 2")
    var str3= readLine()!!
    var num2:Int=str3.toInt()

    println("Enter Operation(+,-,*,/)")
    var str1 =readLine()!!

    var result=when(str1){
        "+"-> num1+num2
        "-"-> num1-num2
        "*"-> num1*num2
        "/"-> num1/num2
        else-> 0
    }
    println(result)

}
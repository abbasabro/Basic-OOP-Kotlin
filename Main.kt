import java.time.temporal.TemporalAmount

fun main(args: Array<String>) {
    println("Hello World!")
    var obj =FirstClass()
    obj.name="Abbas"
    println("Name is : ${obj.name}")
    var obj2=FirstJavaClass()
    obj.name="Ali"
    println("Java Name is :${obj.name}")

    var num1:Int=3
    var num2 :Int=4


    //String Concatination
    var result  = num1+num2
    println("Result=$result")
    //IF ELSE  Two Ways
    println("If-Else")
    var a:Int=0;
    a=if(num1>num2)
        num1
    else
        num2
    println(a)

    println("String Comparsion")
    //String Comparsion
    var str1 : String="Abbas"
    var str2: String= "ABBAs"

    if(str1.equals(str2,true))//Second parameter for ignore case
        println("Same")
    else
        println("Not same")

    //LOOPs and Range

    println("Loops and Range")
    var nums=1..5//range
    //enhanced for loop
    for(n in nums){
        println(n)
    }
    var nums2=10 downTo 1
    for(n in nums2){
        println(n)
    }
    var nums3=1..5
    for(n in nums3 step 2){
        println(n)
    }

    //function calling
    println("Funtion calling")
    var add_result=add(5,6)
    println(add_result)
    var max_result=max(4,67)
    println(max_result)

    println("Default parameter function calling...")
    var amt1=calc(50)
    println("Amount 1=$amt1")
    var amt2=calc(50,0.03)
    println("Amount 2=$amt2")


}
//two ways of Function writing
fun add(a:Int, b:Int):Int{
    return a+b
}
fun max(a:Int,b:Int):Int=if(a>b)a else b
//Default parameter function
fun calc(amount: Int,interest:Double=0.04):Int
{
    return (amount+amount*interest).toInt()
}
package OOP
//Secondary Constructor
class Human2 (var n:String)
{
    var name :String = n
    var age :Int = 0
    constructor(age: Int, name: String) :this(name)
    {
        this.age=age
    }
    fun display()
    {
        println("Name : $name")
        println("Age : $age")
    }
}
fun main(args:Array<String>)
{
     var person1=Human2(18,"Abbas")
    person1.display()
}
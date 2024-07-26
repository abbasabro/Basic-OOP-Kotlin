package OOP
//Overriding Run-time Polymorphism
open class A
{
   open fun hello()
   {
       println("I Am A's Hello ")
   }
}
class B: A()
{
    override fun hello() {
        println("Override:  I am B's Hello")
    }
}


fun main(args: Array<String>) {
    var obj=B()
    obj.hello()

}
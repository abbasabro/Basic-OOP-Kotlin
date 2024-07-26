package OOP
//Primary Constructor
class Human (var n: String)
{
    var name : String=n
    fun display(){
        println("Name =$name")
    }

}
class Alien public constructor(var n: String)
{
  var name: String = n
  fun print()
  {
      print("Alien Name $name")

  }
}
fun main(args: Array<String>){
    var obj= Human("Abbas")
    obj.display()
    var obj2= Alien("Jaddu")
    obj2.print()
}

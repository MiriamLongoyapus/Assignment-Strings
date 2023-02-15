fun main() {
    val school = "akiraChix"
    val letters = "a, i, r"
    println(letters.split(" ,"))
    println(sentence("Atarah",23))
    println(length("Nairobi"))
    conditions("Atarah")


}
fun sentence(name: String,age: Int ): String{
    var x = name
    var y = age
    return ("Hi,my name is $name and I am $age years old")
}
fun length(name: String): Int{
    return name.length
}
fun conditions (name: String) {
    var name = "tarah"
    if (name== name) {
        println("Thats me")
    } else {
        println("I dont know who that is")
    }
}









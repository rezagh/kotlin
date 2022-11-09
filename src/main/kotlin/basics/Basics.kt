
package basics


fun main() {
    var street: Int = 1 //create a var. this is NOT a dynamic type. its a mutable var
    var num: String = "xx"
    var xx = "xxx" //inters the type

    val xyz = 1 //immuatable variable.

    //var is mutable val is immutable

    testFunctions(firstname = "reza")
}

fun ifelse (name:String){
    //if-else doesnt need return. it has it in built
    if (name == null)
        "abc"
    else name
}

//elvis symbol
//If the expression to the left of ?: is not null, the Elvis operator returns it, otherwise it returns the expression to the right
fun elivs(name : String?){
    val v1 = ""
    val v2 = ""
    val r1 = v1?.length ?: -1
    val r2 = v2 ?: v2
}

//default value
fun testFunctions(firstname:String, lastname: String ="ghafari") {
    println("$firstname $lastname")
}

//any return type
fun testReturns(input: Integer): Any{
    if (input.equals(1))
        return "aa"
    return 0
}


class Test(val abc : String){
    var name = ""
    fun xx(){}
}

fun testWhen(numberOfFish: Int ){
    //when is like switch
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}


//test null with ?
//You can test for null with the ? operator, saving you the pain of writing many if/else statements.
fun testNull(){
    var abc = 7

    if (abc != null){
        abc.dec()
    }

    //another way of checking for null
    abc?.dec()
}





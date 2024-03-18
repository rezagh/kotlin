
//main function is the entry point
fun main() {
    print("hello world")

    //calling a function
    printSomething()
}


//defining a function. with a default parameter
fun printSomething(name: String = "some name"){
    print(name)
}

//one line version of above
fun printSomething2(name: String = "some name") = print(name)



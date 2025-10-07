// This could be the format for other datatypes like list in Kotlin

fun main() {
    // An array
    val names: Array<String> = arrayOf("Sam", "Elliot", "Alderson", "Jade")
    
    // Looping through an Array
    for (item in names){
        println(item)
    }
    
    // Looping through an Array with index
    for ((index_value, item) in names.withIndex())
    {
        println("$index_value: $item") // String formatting using '$' for specifying variables.
    }
}

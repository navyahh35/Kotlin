fun main() {
	// basic for loop 1 to 10
    for(i in 1..10)
    {
        println(i)
    }
    
    println()
    
    // basic for loop 1 to 9 using 'until'
    for(i in 1 until 10)
    {
        println(i)
    }

	// basic for loop with step value
	for(i in 1..10 step 2)
	{
		println(i)
	}

	// Reverse printing | from 10 to 1
	for(i in 10 downTo 1){
        println(i)
    }
}

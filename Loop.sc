object Loop{
def main(args:Array[String]) = {
	var daysOfWeek = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
	
	for(i <- 0 to daysOfWeek.size-1	){
		println(daysOfWeek(i))
	}
	
	// Alternative approach instead of doing size-1 as above
	for(i <- 0 until daysOfWeek.size){
		println(daysOfWeek(i))
	}
	
	
	//Mention condition in for loop
	for(i <- daysOfWeek){
		if(i == "Mon")
			println("Hell! It's monday")
	}
	
	
	//The above loop can be simplified in Scala using pattern guards
	for(i <- daysOfWeek if i == "Mon"){
			println("Hell! It's monday")
	}
	
	//Nesting of loops is pretty simple in scala
	for(i <- 0 until daysOfWeek.size ;
	j <- daysOfWeek){
			println(s"$i  $j")
	}
	
	println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
	
	//For loops can be statements using yield keyword
	val var3 = for(i <- daysOfWeek) yield
			    {
					i match{
					case "Mon" => "It's Low time"
					case "Fri" => "it's High time"
					case x => "It's ok time" + x
					}
				}
				
	println(var3)
}
}
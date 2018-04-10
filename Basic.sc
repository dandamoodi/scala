object Basic{
def main(args:Array[String]) = {
	//Val create a immutable 
	val l = "scala"
	//This is not possible as val creates a immutable object
	//l = "java"
	
	//Var is mutable
	var r = "scala"
	r = "java"
	println(r)
	
	
	//Assign a type in Scala
	var var1 : String = "This is a String"
	println(var1)
	
	//Type will be inferred if we dont specify one
	var var2 = 18.8
	println(var2.getClass)
}
}
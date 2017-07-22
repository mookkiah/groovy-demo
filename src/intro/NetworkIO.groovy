package intro

println 'http://jsonplaceholder.typicode.com/users/1'.toURL().text

def lineNumber = 0
file = new File("./resources/food-menu.xml")
file.eachLine{ line ->
	lineNumber++
	println "$lineNumber: $line"
}

def file = new File(".")
file.eachFileRecurse {println it}


package intro

/**
 * Strings with embedded values are considered as GString
 * 
 * @author mookkiahm
 *
 */

def name = "GString"
println "name type " + name.class
def whoAmI =  "I am a $name";

println "whoAmI type " + whoAmI.class

def members = ["John", "Peter", "Alvin", "Tom"]
def greet = "Hello"
for (int i; i < members.size(); i++) {  // For Demo int -> def, no parenthesis
	println "$greet ${members[i]}"  // For Demo
}



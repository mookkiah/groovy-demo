package intro

/**
 * Strings with double quotes are considered as groovy.lang.GString
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

println "------------------"
members.eachWithIndex {member, index -> println members[index]}



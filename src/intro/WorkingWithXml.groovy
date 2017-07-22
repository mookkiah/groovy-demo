package intro

import groovy.xml.MarkupBuilder

String xmldocument = new File("./resources/food-menu.xml").text
def menu = new XmlSlurper().parseText(xmldocument)
println menu.food.size()
menu.food.each{println it.name}

//unknown tag
println menu.food[0].color

StringWriter writer = new StringWriter()
MarkupBuilder foodNames = new MarkupBuilder(writer)
foodNames.menu{
	menu.food.eachWithIndex { f, i -> 
			food (id: "$i"){
				name("$f.name")
			}
	}
}
println writer.toString()
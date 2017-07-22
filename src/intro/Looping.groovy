package intro

def states = ["Florida", 'Georgia', 'North Carolina', 'Texas']
states.each {name -> println name}
println ''
states.each{println it}  // explain it keyword
def statesWithX = states.grep(~/.*x.*/)
println statesWithX

//filtering
def statesContainsE = states.findAll{it.contains 'e'}.each {println it}

//other samples
5.times {println "Times + $it "}
1.upto(3) {println "Up + $it "}
4.downto(1) {println "Down + $it "}
def sum = 0
1.upto(100) {sum += it}
println sum
(1..6).each {println "Range $it"}
('a'..'h').each {println it}
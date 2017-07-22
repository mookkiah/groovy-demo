package intro

def capitalMap = ['Florida' : 'Tallahassee', 'Connecticut' : 'Hartford', 'Rhode Island' : 'Providence' ]
println capitalMap
println capitalMap.sort()
println capitalMap

capitalMap.each { entry -> println "$entry.key --> $entry.value" }
println '##########'
capitalMap.each { key, value -> println "$key --> $value" }
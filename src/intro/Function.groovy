package intro

def boolean isEven(def num){   //return type is optional
	return num%2 == 0   //return keyword is optional
}

(1..20).findAll{isEven(it)}.each {println it}
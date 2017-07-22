package intro


// https://mvnrepository.com/artifact/junit/junit
@Grapes(
@Grab(group='junit', module='junit', version='4.12', scope='test')
)

import static org.junit.Assert.*;

class SpecialWords {

	public static void main(String[] args){

		// it is not keyword but special
		def it = "Hello"
		println it

		def shirtPriceString = "19.99"
		//def shirtPrice = shirtPriceString as BigDecimal  //For Demo - remove as BigDecimal
		def BigDecimal shirtPrice = shirtPriceString
		assertEquals (BigDecimal.class, shirtPrice.class)
		assertEquals(19.99, shirtPrice)
		shirtPrice = shirtPrice+1
		assertEquals(20.99, shirtPrice)
		assertEquals(2, shirtPrice.scale)
		
	}
}
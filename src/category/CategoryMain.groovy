package category

// Resource : http://mrhaki.blogspot.com/2009/09/groovy-goodness-use-categories-to-add.html
class CategoryMain {

	public static void main(String[] args){
		use (Speak) {
			assert 'PAY ATTENTION!' == "Pay attention".shout()
			assert 'sssh.. Be vewy, vewy, quiet.' == "Be vewy, vewy, quiet.".whisper()
			assert 'sssssssh.. Be vewy, vewy, quiet.' == "Be vewy, vewy, quiet.".whisper(true)
			assert 'Groovy rocks. Sir, yes sir!' == "Groovy rocks".army()
		}

		use(StreetTalk) {
			assert 'Yo, yo, here we go. Groovy is fun!' == 'Groovy is fun!'.hiphop()
		}

		// We can use static methods from other Java classes. // explain with demo grape
		/*use (org.apache.commons.codec.digest.DigestUtils) {
			assert '900150983cd24fb0d6963f7d28e17f72' == 'abc'.md5Hex()
		}*/
	}
}

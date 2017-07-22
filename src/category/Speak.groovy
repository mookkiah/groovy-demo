package category

class Speak {
    static String shout(String text) {  // Method argument is String, so we can add shout() to String object.
        text.toUpperCase() + '!'
    }
     
    static String whisper(String text, boolean veryQuiet = false) {
        "${veryQuiet ? 'sssssssh' : 'sssh'}.. $text"
    }
     
    static String army(String text) {
        "$text. Sir, yes sir!"
    }
}
package category

// Or we can use the @Category annotation.
@Category(String)
class StreetTalk {
    String hiphop() {
        "Yo, yo, here we go. ${this}"
    }
}

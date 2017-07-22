package intro

// demo of auto conversion
def String[] strings = "This is a long sentence".split();
// convert Array to list
def List listStrings = strings
// convert List back to Array
def String[] arrayStrings = listStrings

assert strings.class.isArray()
assert listStrings.class == ArrayList.class
assert !listStrings.class.isArray()
assert arrayStrings.class.isArray()
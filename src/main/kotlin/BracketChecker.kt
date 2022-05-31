/**
 *  @author Maxim Bezmen.
 * 31.05.2022
 */
class BracketChecker {
    private val input: String;

    constructor(input: String) {
        this.input = input;
    }

    fun check() {
        val stackSize = input.length;
        val theStack = StackX(stackSize);

        for (j in input.indices) {
            var ch = input[j];
            when (ch) {
                '{', '[', '(' -> theStack.push(ch)
                '}', ']', ')' -> {
                    if (!theStack.isEmpty()) {
                        val chx = theStack.pop();
                        if (ch == '}' && chx != '{' ||
                            ch == ']' && chx != '[' ||
                            ch == ')' && chx != '('
                        ) {
                            println("Error: $ch at $j");
                        }
                    } else {
                        println("Error: $ch at $j");
                    }
                }
                else -> break;
            }
        }
        if (!theStack.isEmpty()){
            println("Error: missing right delimiter.");
        }
    }
}
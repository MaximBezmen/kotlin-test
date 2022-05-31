/**
 *  @author Maxim Bezmen.
 * 31.05.2022
 */
class StackX {
    private val maxSize: Int;
    private val stackArray: CharArray;
    private var top: Int;

    constructor(size: Int) {
        maxSize = size;
        stackArray = CharArray(maxSize);
        top = -1;
    }

    fun push(value: Char) {
        stackArray[++top] = value;
    }

    fun pop(): Char {
        return stackArray[top--];
    }

    fun peek(): Char {
        return stackArray[top];
    }

    fun isEmpty(): Boolean {
        return (top == -1);
    }
}
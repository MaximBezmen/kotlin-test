fun main(args: Array<String>) {
    val input = "([{}])";
    val checker = BracketChecker(input);
    println(checker.check());
}
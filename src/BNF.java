/**
 * The BNF class represents the entry point of the program.
 */
public class BNF {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments. The first argument should be the path to the input file,
     *             and the second argument should be the path to the output file.
     */
    public static void main(String[] args) {

        String[] inputFile = FileInput.readFile(args[0], true, true);
        NonTerminalSymbols nonTerminalSymbols = new NonTerminalSymbols();

        for(String input : inputFile){
            nonTerminalSymbols.defineSymbols(input);
        }

        String result = "(";

        // Generate output for the start symbol "S"
        result += nonTerminalSymbols.giveOutput("S") + ")";
        FileOutput.writeToFile(args[1], result, false, false);

    }
}
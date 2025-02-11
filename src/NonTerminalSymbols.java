import java.util.Map;
import java.util.HashMap;

/**
 * The NonTerminalSymbols class represents a collection of non-terminal symbols and their definitions.
 */
public class NonTerminalSymbols {
    private Map<String, String> nonTerminals;
    public static String result = "";

    /**
     * Constructs a new NonTerminalSymbols object with an empty map.
     */
    public NonTerminalSymbols() {
        nonTerminals = new HashMap<>();
    }

    /**
     * Defines symbols by parsing the input string.
     *
     * @param input The input string containing the symbol definition.
     */
    public void defineSymbols(String input) {
        String[] symbolInfo = input.split("->");
        String symbol = symbolInfo[0];
        String sequenceOfSymbols = symbolInfo[1];
        String result = "";
        // Store the symbol and its definition in the map
        nonTerminals.put(symbol, sequenceOfSymbols);

    }

    /**
     * Generates output for a given symbol.
     *
     * @param symbol The symbol for which output needs to be generated.
     * @return The generated output string.
     */
    public String giveOutput(String symbol){
        String possibilities = nonTerminals.get(symbol);
        for (int k = 0; k < possibilities.length(); k++){
            if (possibilities.charAt(k) == '|'){
                result += "|";
                continue;
            }else{
                char chValue = possibilities.charAt(k);
                String value = String.valueOf(chValue);
                if(nonTerminals.containsKey(value)){
                    result += "(";
                    //// If the value is a non-terminal symbol recursively generate output for the non-terminal symbol
                    giveOutput(value);
                    result += ")";
                }else{
                    // If the value is a terminal symbol, add it to the result
                    result += value;
                }
            }
        }
        return result;
    }
}

package au.com.brackets;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Rohitha Wanni Achchige on 28/2/17.
 * braces/brackets/parentheses validator
 */
public class CheckBrackets {
    private final Map<Character, Character> bracketsMap;
    private final Set<Character> bracketsSet;

    public CheckBrackets() {
        bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('[', ']');
        bracketsMap.put('{', '}');

        bracketsSet = new HashSet<>();
        bracketsSet.addAll(bracketsMap.keySet());
        bracketsSet.addAll(bracketsMap.values());
    }

    /**
     * Validate given character string contains valid brackets
     *
     * @param characterString character string to check the brackets validation
     * @return boolean
     */
    public boolean isValid(String characterString) {
        if (characterString == null || characterString.isEmpty()) {
            return true; // Empty or null string treated as correct braces/brackets/parentheses
        }

        Stack<Character> characterStack = new Stack<>();
        Stream<Character> characterStream = characterString.chars().mapToObj(i -> (char) i);
        characterStream.filter(bracketsSet::contains).forEach(characterValue -> {
            if (bracketsMap.keySet().contains(characterValue)) {
                characterStack.push(characterValue);
            } else if (bracketsMap.values().contains(characterValue)) {
                if (!characterStack.empty() && bracketsMap.get(characterStack.peek()) == characterValue) {
                    characterStack.pop();
                } else {
                    characterStack.push(characterValue);
                }
            }
        });
        return characterStack.isEmpty();
    }
}

package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.formatter.IFormatter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class format code
 */
public class Formatter implements IFormatter {
    /**
     * format method
     *
     * @param inputContainer
     * @param outputContainer
     */
    public void format(final IInputStringContainer inputContainer, final IOutputStringContainer outputContainer) {
        int length = inputContainer.getLength();
        Map<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put('{', "\n");
        Set keys = hashMap.keySet();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < keys.size(); j++) {
                
            }
        }
    }
}

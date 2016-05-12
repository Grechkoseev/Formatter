package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.inputStringContainer.Implementation.InputStringContainerException;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.FileReaderException;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.FileWriterException;

import java.util.HashMap;
import java.util.Map;

/**
 * Class format code
 */
public class Formatter implements IFormatter {
    /**
     * Magic method
     *
     * @param inputContainer
     * @param outputContainer
     */
    public void format(final IInputStringContainer inputContainer, final IOutputStringContainer outputContainer, final IReader reader, final IWriter writer) throws FormatException {
        Map<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put(';', ";\n    ");
        hashMap.put('{', " {\n    ");
        hashMap.put('}', "\n} ");
        //string implementation
        try {
            int length = inputContainer.getLength();
            for (int i = 0; i < length; i++) {
                if (hashMap.containsKey(inputContainer.getElement(i))) {
                    outputContainer.setSubstring(new StringBuffer(hashMap.get(inputContainer.getElement(i))));
                } else {
                    outputContainer.setSubstring(new StringBuffer(String.valueOf(inputContainer.getElement(i))));
                }
            }
        } catch (InputStringContainerException ex) {
            throw new FormatException("Incoming argument is null", ex);
        }

        //file implementation
        try {
            while (reader.hasNext()) {
                Character inputChar = reader.getElement();
                if (hashMap.containsKey(inputChar)) {
                    writer.write(hashMap.get(inputChar));
                } else {
                    writer.write(String.valueOf(inputChar));
                }
            }
            reader.close();
            writer.close();
        } catch (FileReaderException ex) {
            throw new FormatException("Can't read file", ex);
        } catch (FileWriterException ex) {
            throw new FormatException("Can't write in file", ex);
        }
    }
}

package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.ReaderException;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.WriterException;

import java.util.HashMap;
import java.util.Map;

/**
 * Class format code
 */
public class Formatter implements IFormatter {
    /**
     * Magic method
     * @param reader
     * @param writer
     * @throws FormatException
     */
    public void format(final IReader reader, final IWriter writer) throws FormatException {
        Map<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put(';', ";\n");
        hashMap.put('}', "\n} ");
        hashMap.put(':', ":\n");
        int countOfBraces = 0;
        try {
            Character previousChar = ' ';
            while (reader.hasNext()) {
                Character inputChar = reader.getElement();
                char[] array = new char[countOfBraces * 4];
                for (int i = 0; i < array.length; i++) {
                    array[i] = ' ';
                }
                String stringOfSpaces = new String(array);
                switch (inputChar) {
                    case ' ':
                        hashMap.put('{', "{\n" + stringOfSpaces);
                        if (hashMap.containsKey(inputChar)) {
                            writer.write(hashMap.get(inputChar));
                        } else {
                            writer.write(String.valueOf(inputChar));
                        }
                        hashMap.put(' ', "");
                        break;
                    case '{':
                        countOfBraces++;
                        hashMap.remove(' ');
                        hashMap.put(';', ";\n" + stringOfSpaces);
                        writer.write(hashMap.get(inputChar) + "    ");
                        break;
                    case '}':
                        countOfBraces--;
                        if (previousChar.equals(';')) {
                            writer.write(String.valueOf(inputChar));
                        } else {
                            hashMap.put('}', '\n' + stringOfSpaces.substring(0, stringOfSpaces.length() - 4) + '}');
                            writer.write(hashMap.get(inputChar));
                        }
                        break;
                    case ';':
                        hashMap.put(';', ";\n" + stringOfSpaces.substring(0, stringOfSpaces.length() - 4));
                        writer.write(hashMap.get(inputChar));
                        break;
                    default:
                        hashMap.remove(' ');
                        hashMap.put('{', " {\n" + stringOfSpaces);
                        if (previousChar.equals(';')) {
                            writer.write("    ");
                        }
                        writer.write(String.valueOf(inputChar));
                        break;
                }
                previousChar = inputChar;
            }
            reader.close();
            writer.printOnConsole();
            writer.close();
        } catch (ReaderException ex) {
            throw new FormatException("Can't read file", ex);
        } catch (WriterException ex) {
            throw new FormatException("Can't write in file", ex);
        } catch (NullPointerException ex) {
            throw new FormatException("Incoming stream is null", ex);
        }
    }
}

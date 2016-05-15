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
     * magic method
     * @param reader
     * @param writer
     * @throws FormatException
     */
    public void format(final IReader reader, final IWriter writer) throws FormatException {
        Map<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put(';', ";\n    ");
        hashMap.put('{', " {\n    ");
        hashMap.put('}', "\n} ");
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

package ru.pushkarev.homeWork_20_05_Input_and_OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class CloseTestException {
    // делаем Логгер. Статическое файнал поле на самом классе
    private static final Logger LOGGER = LoggerFactory.getLogger(CloseTestException.class);

    public static void main(String[] args) throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream("closeTest.bin");
            LOGGER.error("Поток {} успешно открыт", os);
            os.write(2);
            os.write(223);
            os.write(34);

        } catch (IOException e) {
            LOGGER.error("Ошибка при работе с потоком", e);
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    LOGGER.error("Ошибка при закрытии потока", e);
                    e.printStackTrace();
                }
            }
        }
        //try - with - resources

        /*try (OutputStream os2 = new FileOutputStream("closeDemo.bin");
             //InputStream is2 = new FileInputStream("closeDemo2.bin")){
             os2.write(2);
             os2.write(23);
             os2.write(20);
        }catch (IOException e){
        LOGGER.error("Ошибка при закрытии потока", e);
        e.printStackTrace();
    */
    }
}


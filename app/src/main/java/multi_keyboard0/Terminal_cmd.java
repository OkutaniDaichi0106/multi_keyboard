package multi_keyboard0;

import org.jline.keymap.*;

public class Terminal_cmd {
    void setLanguage() {
        KeyBoardConfig keyBoardConfig = new KeyBoardConfig();
        String availableLanguage = keyBoardConfig.checkAvailableLanguages();
    }
    void readImputCharacter() {

    }
    void showOutputCharacter() {

    }
}
class Terminal_Error {
    String errorMessage;
    int errorCode;


}
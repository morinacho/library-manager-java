package librarymanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import librarymanager.view.MainWindow;

public class LibraryManager {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        MainWindow main = new MainWindow();
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}

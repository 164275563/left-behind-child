import org.eclipse.swt.widgets.Display;

import window.MainWindow;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setBlockOnOpen(true);
        window.open();
        Display.getCurrent().dispose();
    }
}

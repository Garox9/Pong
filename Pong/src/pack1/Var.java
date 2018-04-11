package pack1;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Var {

    static JFrame jf1;
    static int screenwidth = 800, schreenhigh = 600;

    static int x = 20, y = 185;
    static int gegnerx = 755, gegnery = 185;
    static int ballx = 200, bally = 100;

    static boolean moveup = false, movedown = false;

    static int balldirex = 1, balldirey = - 1;

    static int playerPoints = 0, gegnerPoints = 0;

    static Font pixelFont;

    public Var () {

        try {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
        } catch (FontFormatException | IOException e) {

            e.printStackTrace();
        }

    }
}

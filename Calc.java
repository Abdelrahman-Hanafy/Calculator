package calc;

import javax.swing.*;
import java.awt.*;

public class Calc {

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        Screen t = new Screen();
        keys keys = new keys();
        Mbar bar = new Mbar();

        f.setJMenuBar(bar);
        f.add(t, BorderLayout.PAGE_START);
        f.add(keys, BorderLayout.CENTER);

        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

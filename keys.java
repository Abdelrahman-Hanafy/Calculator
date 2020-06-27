
package calc;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class keys extends JPanel {
    
    static JButton b0 = new JButton("0");
    static JButton b1 = new JButton("1");
    static JButton b2 = new JButton("2");
    static JButton b3 = new JButton("3");
    static JButton b4 = new JButton("4");
    static JButton b5 = new JButton("5");
    static JButton b6 = new JButton("6");
    static JButton b7 = new JButton("7");
    static JButton b8 = new JButton("8");
    static JButton b9 = new JButton("9");
    
    static JButton bAdd = new JButton("+");
    static JButton bSub = new JButton("-");
    static JButton bMlt = new JButton("*");
    static JButton bDiv = new JButton("/");
    static JButton blog = new JButton("Log");
    static JButton bln = new JButton("ln");
    static JButton bpow = new JButton("x^");
    static JButton bsqrt = new JButton("sqrt");
    static JButton bexp = new JButton("e^");
    static JButton babs = new JButton("|   |");
    static JButton bsin = new JButton("sin");
    static JButton bcos = new JButton("cos");
    static JButton btan = new JButton("tan");
    
    
    static JButton beq = new JButton("=");
    static JButton bb = new JButton(".");
    
    
    public keys() {
    GridLayout grid = new GridLayout(5,5,5,5);
        setLayout(grid);
        
        add(bsin);
        add(bcos);
        add(btan);
        add(babs);
        add(bexp);
        
        add(b1);
        add(b2);
        add(b3);
        add(bAdd);
        add(bln);
        
        add(b4);
        add(b5);
        add(b6);
        add(bSub);
        add(blog);
        
        add(b7);
        add(b8);
        add(b9);
        add(bMlt);
        add(bpow);
        
        add(bb);
        add(b0);
        add(beq);
        add(bDiv);
        add(bsqrt);
        
        BListner Ab = new BListner();
        b0.addActionListener(Ab);
        b1.addActionListener(Ab);
        b2.addActionListener(Ab);
        b3.addActionListener(Ab);
        b4.addActionListener(Ab);
        b5.addActionListener(Ab);
        b6.addActionListener(Ab);
        b7.addActionListener(Ab);
        b8.addActionListener(Ab);
        b9.addActionListener(Ab);
        bb.addActionListener(Ab);
        
        bAdd.addActionListener(Ab);
        bDiv.addActionListener(Ab);
        bMlt.addActionListener(Ab);
        bSub.addActionListener(Ab);
        beq.addActionListener(Ab);
        blog.addActionListener(Ab);
        bln.addActionListener(Ab);
        bpow.addActionListener(Ab);
        bsqrt.addActionListener(Ab);
        bsin.addActionListener(Ab);
        bcos.addActionListener(Ab);
        btan.addActionListener(Ab);
        babs.addActionListener(Ab);
        bexp.addActionListener(Ab);
        
    }
}

package calc ;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Screen extends JPanel {
        static JTextField s;
        static JTextField s2;
        static JButton clr ;
        static JButton del ;
        static JRadioButton deg;
        static JRadioButton rad;
        
    public Screen() {
        s = new JTextField();
            s.setEnabled(false);
            s.setFont(new Font("Arial", Font.BOLD, 30));
            s.setText("");
            
        s2 = new JTextField();
            s2.setEnabled(false);
            s2.setFont(new Font("Arial", Font.BOLD, 30));
            s2.setText("");
        
        deg = new JRadioButton("Deg");
        rad = new JRadioButton("Rad");
        ButtonGroup group = new ButtonGroup();
        group.add(deg);
        group.add(rad);
        clr = new JButton("CLR");
        del = new JButton("Del");
        
        JPanel b = new JPanel();
            b.add(deg);
            b.add(rad);
            b.add(clr);
            b.add(del);
            
        setLayout(new GridLayout(3, 1));
        add(s);
        add(s2);
        add(b);
        
        BListner Ab = new BListner();
        clr.addActionListener(Ab);
        del.addActionListener(Ab);
        
        BListner Rb = new BListner();
        deg.addActionListener(Rb);
        rad.addActionListener(Rb);
            
    }
}

package calc;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Mbar extends JMenuBar{

    public Mbar() {
    
    JMenu file = new JMenu("File");
        JMenuItem neww = new JMenuItem("New");
        JMenuItem open = new JMenuItem("open");
        JMenuItem close = new JMenuItem("close");
    
    JMenu edit = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem paste = new JMenuItem("paste");
    
    file.add(neww);
    file.add(open);
    file.add(close);
    
    edit.add(copy);
    edit.add(cut);
    edit.add(paste);
        
    add(file);
    add(edit);
    
    }
}

package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BListner implements ActionListener{
    
    static String x;
    static String y;
    static char op;
    static boolean isDeg = false;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        double a,b;
        
        if(e.getSource()== Screen.deg)
        {isDeg = true;}
        else if(e.getSource() == Screen.rad )
        {isDeg = false;}
        
        // numbers 0 - 9 && .
        if (e.getSource() == keys.b0 ){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"0");}
            else {Screen.s.setText("0");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b1){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"1");}
            else {Screen.s.setText("1");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b2){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"2");}
            else {Screen.s.setText("2");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b3){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"3");}
            else {Screen.s.setText("3");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b4){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"4");}
            else {Screen.s.setText("4");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b5){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"5");}
            else {Screen.s.setText("5");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b6){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"6");}
            else {Screen.s.setText("6");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b7){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"7");}
            else {Screen.s.setText("7");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b8){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"8");}
            else {Screen.s.setText("8");Screen.s2.setText("");}}
        else if (e.getSource() == keys.b9){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+"9");}
            else {Screen.s.setText("9");Screen.s2.setText("");}}
        else if (e.getSource() == keys.bb){
            if(Screen.s2.getText().isEmpty()){Screen.s.setText(Screen.s.getText()+".");}
            else {Screen.s.setText(".");Screen.s2.setText("");}}
        
        // basic opprations 
        else if (e.getSource() == keys.bAdd){
            x =Screen.s.getText();
            op ='+' ;
            Screen.s.setText("");}
        
        else if (e.getSource() == keys.bSub){
            if(Screen.s.getText().isEmpty())
            {Screen.s.setText(Screen.s.getText()+"-");}
            else {x =Screen.s.getText();
            op ='-' ;
            Screen.s.setText("");}}
        
        else if (e.getSource() == keys.bMlt){
            x =Screen.s.getText();
            op ='*' ;
            Screen.s.setText("");}
        
        else if (e.getSource() == keys.bDiv){
            x =Screen.s.getText();
            op ='/' ;
            Screen.s.setText("");}
        
        else if (e.getSource() == keys.bpow){
            x =Screen.s.getText();
            op ='^' ;
            Screen.s.setText("");}
        
        // one input oprations
        else if (e.getSource() == keys.blog){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("log("+x+")");
            Screen.s2.setText(""+Math.log10(a));}
        
        else if (e.getSource() == keys.bln){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("ln("+x+")");
            Screen.s2.setText(""+Math.log(a));}
        
        else if (e.getSource() == keys.bsqrt){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("sqrt("+x+")");
            Screen.s2.setText(""+Math.sqrt(a));}
        
        else if (e.getSource() == keys.babs){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("|"+x+"|");
            Screen.s2.setText(""+Math.abs(a));}
        
        else if (e.getSource() == keys.bexp){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("e^"+x);
            Screen.s2.setText(""+Math.exp(a));}
        
        // trig oprations 
         else if (e.getSource() == keys.bsin){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            if(isDeg){a = Math.toRadians(a);}
            Screen.s.setText("sin("+x+")");
            Screen.s2.setText(""+Math.sin(a));}
         
        else if (e.getSource() == keys.bcos){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("cos("+x+")");
            if(isDeg){a = Math.toRadians(a);}
            Screen.s2.setText(""+Math.cos(a));}
        
        else if (e.getSource() == keys.btan){
            x =Screen.s.getText();
            a = Double.parseDouble(x);
            Screen.s.setText("tan("+x+")");
            if(isDeg){a = Math.toRadians(a);}
            Screen.s2.setText(""+Math.tan(a));}
        
        // clr and del
        else if (e.getSource() == Screen.clr){
            Screen.s.setText("");
            Screen.s2.setText("");}
        
        else if (e.getSource() == Screen.del){
            if(!Screen.s.getText().isEmpty()){
            Screen.s.setText(Screen.s.getText().substring(0,Screen.s.getText().length()-1 ));}}
        
        // equal opration
        else if (e.getSource() == keys.beq){
        y =Screen.s.getText();
        Screen.s.setText(x + op + y);
        a = Double.parseDouble(x); 
        b =Double.parseDouble(y); 
            switch(op){
                case '+': Screen.s2.setText(""+(a+b)); break;
                case '-': Screen.s2.setText(""+(a-b));break;
                case '*': Screen.s2.setText(""+(a*b));break;
                case '/': 
                    if (b == 0){Screen.s2.setText("Math Error");break;}
                    else {Screen.s2.setText(""+(a/b));break;}
                case '^': Screen.s2.setText(""+Math.pow(a, b));break;
            }
        }
        } 
}
package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;



/**
 * @Author zhiming.li
 * @Date 2020/6/10 17:28
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener lister=new TimerPrinter();
        Timer t=new Timer(10000, lister);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}
class TimerPrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println(new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
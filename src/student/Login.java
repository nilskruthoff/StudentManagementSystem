/*
 * Created by JFormDesigner on Fri Jan 15 20:55:33 CET 2021
 */

package student;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;

/**
 * @author unknown
 */
public class Login extends JPanel {

    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        emailField = new JTextField();
        email = new JLabel();
        password = new JLabel();
        passwordField1 = new JPasswordField();
        login = new JButton();
        cancel = new JButton();
        title = compFactory.createTitle("Einloggen ");

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(null);

        //---- emailField ----
        emailField.setFont(new Font("Roboto", Font.PLAIN, 16));
        add(emailField);
        emailField.setBounds(280, 140, 215, 40);

        //---- email ----
        email.setText("Email");
        email.setFont(new Font("Roboto", Font.PLAIN, 21));
        add(email);
        email.setBounds(140, 140, 85, 45);

        //---- password ----
        password.setText("Passwort");
        password.setFont(new Font("Roboto", Font.PLAIN, 20));
        add(password);
        password.setBounds(140, 225, 90, 30);

        //---- passwordField1 ----
        passwordField1.setFont(new Font("Roboto", Font.PLAIN, 16));
        add(passwordField1);
        passwordField1.setBounds(280, 220, 220, 40);

        //---- login ----
        login.setText("Einloggen");
        login.setFont(new Font("Roboto", Font.PLAIN, 16));
        add(login);
        login.setBounds(165, 320, 118, 40);

        //---- cancel ----
        cancel.setText("Abbrechen");
        cancel.setFont(new Font("Roboto", Font.PLAIN, 16));
        add(cancel);
        cancel.setBounds(360, 320, 115, 40);

        //---- title ----
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(title);
        title.setBounds(265, 5, 100, 36);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField emailField;
    private JLabel email;
    private JLabel password;
    private JPasswordField passwordField1;
    private JButton login;
    private JButton cancel;
    private JLabel title;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

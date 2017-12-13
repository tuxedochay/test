/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class BtreeDisplay extends JPanel {
    BtreeDisplay(Node tree){
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(new BorderLayout());
        if(tree != null)
        {
            String value=String.valueOf(tree.value);
            int pos = SwingConstants.CENTER;
            JLabel rootLabel = new JLabel(value,pos);
            add(rootLabel,BorderLayout.NORTH);
            JPanel panel = new JPanel(new GridLayout(1,2));
            panel.add(new BtreeDisplay(tree.left));
            panel.add(new BtreeDisplay(tree.right));
            add(panel);
        }
    }
}

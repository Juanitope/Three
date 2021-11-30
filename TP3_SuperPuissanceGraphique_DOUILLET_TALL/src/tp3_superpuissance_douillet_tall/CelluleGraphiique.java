/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author douil
 */
public class CelluleGraphiique extends JButton {
    Cellule celluleAssocie;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
   
    
    
    public CelluleGraphiique (Cellule uneCellule) {
        celluleAssocie = uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide); 
    }
}

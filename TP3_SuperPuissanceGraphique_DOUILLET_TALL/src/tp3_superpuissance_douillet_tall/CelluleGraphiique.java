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
    ImageIcon img_desintegrateur = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    
    public CelluleGraphiique (Cellule uneCellule) {
        celluleAssocie = uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (celluleAssocie.presenceTrouNoir()==true){
            setIcon(img_trouNoir);
        }
        else if (celluleAssocie.presenceDesintegrateur()==true){
            setIcon(img_desintegrateur);
        }
        else {
            String couleur_jeton = celluleAssocie.lireCouleurDuJeton();
            switch (couleur_jeton){
                case " "  :
                    setIcon(img_vide);
                    break;
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
            }
        }
        setIcon(img_vide); 
    }
}

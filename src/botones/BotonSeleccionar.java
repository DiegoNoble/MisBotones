/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseListener;

/**
 *
 * @author dnoble
 */
public class BotonSeleccionar extends javax.swing.JLabel implements MouseListener {

    private final String IMAGEN_NORMAL = "/imagenes/accept_normal.png";
    private final String IMAGEN_CHICA = "/imagenes/accept_chico.png";
    private final String IMAGEN_GRANDE = "/imagenes/accept_grande.png";

    public BotonSeleccionar() {
        super();
        //se le da un tamaño        
        this.setPreferredSize(new Dimension(60, 60));
        //se le coloca una imagen
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_NORMAL)));
        //se cambia de cursor default por otro, el de la "manito"
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //se añade los eventos del mouse
        this.addMouseListener(this);
        this.setFont(new java.awt.Font("Tahoma", 1, 12));
        this.setText("Seleccionar");
        this.setBorder(null);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setIconTextGap(-3);
        this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        this.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_GRANDE)));
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_CHICA)));
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_NORMAL)));
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_GRANDE)));
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(IMAGEN_NORMAL)));
    }
}

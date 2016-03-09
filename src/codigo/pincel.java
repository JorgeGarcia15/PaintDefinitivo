/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class pincel extends Ellipse2D.Double {
     ArrayList listaCirculos = new ArrayList();
    public Color color = null;
    public boolean relleno = false;

    
 public pincel (int _x, int _y, int _width,  Color _color, boolean _relleno, Graphics2D g2){

       for (int i = 0; i < listaCirculos.size(); i++) {
        if (listaCirculos.get(i) instanceof Circulo) {
                ((Circulo) listaCirculos.get(i)).pintaYColorea(g2);
            }
    }
        
 }
        public void pintaYColorea(Graphics2D g2){
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
}  
}
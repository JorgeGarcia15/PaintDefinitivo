/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Administrator
 */
public class Poligono extends Polygon {
    
        public Color color = null;
    public boolean relleno = false;

    
 public Poligono (int _x, int _y, int _width,  Color _color, boolean _relleno, int numeroLados){

       for(int i=0; i<numeroLados; i++){
        addPoint((int) (_x + _width * Math.cos(i * 2 * Math.PI /numeroLados)),
        (int) (_y + _width * Math.sin(i*2 * Math.PI / numeroLados)));
       }
        this.color = _color;
        this.relleno = _relleno;
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
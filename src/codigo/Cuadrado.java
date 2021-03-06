
/*
 * Mi segunda clase java

La clase triangulo permite almacenar un triangulo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;

/**
 *
 * @author Jorge Cisneros
 */
public class Cuadrado extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
     public boolean tipoRelleno = false;
    public Stroke contorno = null;
    public GradientPaint degradado = null;

    
    public Cuadrado (int _x, int _y, int _width,  Color _color, boolean _relleno, float _grosor){

        this.npoints = 4;
        this.xpoints[0] = _x - _width/2;
        this.ypoints[0] = _y - _width/2; 

        this.xpoints[1] = _x - _width/2;
        this.ypoints[1] = _y + _width/2;
 
        this.xpoints[2] = _x + _width/2;
        this.ypoints[2] = _y + _width/2;
        
        this.xpoints[3] = _x + _width/2;
        this.ypoints[3] = _y - _width/2;
        
        this.color = _color;
        this.relleno = _relleno;
//        this.tipoRelleno = _tipoRelleno;
        
//        contorno = new BasicStroke(_grosor);
       degradado = new GradientPaint(_x,_y,_color,_x+_width, _y,color.WHITE);
        
    }
        public void pintaYColorea(Graphics2D g2){
            
            g2.setPaint(degradado);
            
            g2.setColor(this.color);
            if (this.relleno) {
                
               
                g2.fill(this);
                
            
            } else {
                g2.draw(this);
            }
            
    }
}

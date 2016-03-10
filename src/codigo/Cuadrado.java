
/*
 * Mi segunda clase java

La clase triangulo permite almacenar un triangulo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;

import java.awt.BasicStroke;
import java.awt.Color;
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
    public Stroke contorno = null;
    final static float dash1[] = {10.0f};
    
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
        
        contorno = new BasicStroke(_grosor,BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_MITER,
                        1.0f, dash1, 0.0f);
        
    }
        public void pintaYColorea(Graphics2D g2){
            g2.setStroke(contorno);
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}

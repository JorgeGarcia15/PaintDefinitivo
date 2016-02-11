/*
* Mi segunda clase java
 
La clase triangulo permite almacenar un triangulo
además de su posición en la pantalla, si está relleno o no
, su color etc
*/
package codigo;
 
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
 
/**
*
* @author Jorge Cisneros
*/
public class Cruz extends Polygon {
 
    public Color color = null;
    public boolean relleno = false;
 
    public Cruz(int _x, int _y, int _width, Color _color, boolean _relleno) {
 
       
        addPoint(_x - _width / 2,_y - _width - _width/2);
 
        addPoint(_x - _width / 2,_y - _width / 2);
 
        addPoint(_x - _width- _width/2,_y - _width / 2 );
 
        addPoint(_x - _width- _width/2,_y + _width / 2);
       
        addPoint(_x - _width/2,_y + _width / 2);
            
        addPoint(_x - _width/2,_y + _width + _width/2);
 
        addPoint(_x + _width/2,_y + _width + _width/2);
 
        addPoint( _x + _width / 2,_y + _width/2);
 
        addPoint(_x + _width + _width/2,_y + _width / 2);
       
        addPoint(_x + _width + _width/2,_y - _width / 2);
       
        addPoint( _x + _width/2,_y - _width / 2);
       
        addPoint( _x + _width/2, _y - _width-  _width/2);
 
       
 
        this.color = _color;
        this.relleno = _relleno;
 
    }
 
    public void pintaYColorea(Graphics2D g2) {
        g2.setColor(this.color);
        if (this.relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
}
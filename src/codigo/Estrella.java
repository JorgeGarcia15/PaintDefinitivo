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
public class Estrella extends Polygon {
 
    public Color color = null;
    public boolean relleno = false;
    public Stroke contorno = null;
 
    public Estrella(int _x, int _y, int _width, Color _color, boolean _relleno, float _grosor) {
 
        
       
//           
//             addPoint(_x,(int)( _y - (Math.sin(0.628319)*_width)));
//            addPoint((int)(_x + Math.cos(0.628319)*_width ),(int)( _y -_width));
//            addPoint((int)(_x + (Math.cos(0.628319)*_width) ) , _y );
//            addPoint((int)(_x + (Math.cos(0.628319)*_width)+ Math.cos(0.628319)*_width-Math.cos(1.25664)*_width ) , _y +_width );
//            addPoint((int)(_x + Math.cos(0.628319)*_width-Math.cos(1.25664)*_width) , (int)(_y + Math.sin(1.25664)*_width) );
//            addPoint((int)(_x + Math.cos(0.628319)*_width-Math.cos(1.25664)*_width - Math.cos(0.628319)*_width+Math.cos(1.25664)*_width) , (int)(_y + Math.sin(1.25664)*_width) +_width);
//            addPoint((int)(_x - Math.cos(0.628319)*_width+Math.cos(1.25664)*_width) , (int)(_y + Math.sin(1.25664)*_width) );
//            addPoint((int)(_x - Math.cos(0.628319)*_width+Math.cos(1.25664)*_width - (Math.cos(0.628319)*_width)) , (int)_y+_width );
//            addPoint((int)(_x - (Math.cos(0.628319)*_width) ) , _y );
//            addPoint((int)(_x - Math.cos(0.628319)*_width ),(int)( _y -_width));
        
            addPoint((int)(_x - Math.cos(0.628319)*_width-Math.cos(1.25664)*_width + Math.cos(0.628319)*_width+Math.cos(1.25664)*_width) , (int)(_y - Math.sin(1.25664)*_width) -_width);
            addPoint((int)(_x + Math.cos(0.628319)*_width-Math.cos(1.25664)*_width) , (int)(_y - Math.sin(1.25664)*_width) );
            addPoint((int)(_x + Math.cos(0.628319)*_width-Math.cos(1.25664)*_width + (Math.cos(0.628319)*_width)) , (int)_y-_width );
            addPoint((int)(_x + (Math.cos(0.628319)*_width) ) , _y );
            addPoint((int)(_x + Math.cos(0.628319)*_width ),(int)( _y +_width));
            addPoint(_x,(int)( _y + (Math.sin(0.628319)*_width)));
            addPoint((int)(_x - Math.cos(0.628319)*_width ),(int)( _y +_width));
            addPoint((int)(_x - (Math.cos(0.628319)*_width) ) , _y );
            addPoint((int)(_x - (Math.cos(0.628319)*_width)- Math.cos(0.628319)*_width+Math.cos(1.25664)*_width ) , _y -_width );
            addPoint((int)(_x - Math.cos(0.628319)*_width+Math.cos(1.25664)*_width) , (int)(_y - Math.sin(1.25664)*_width) );
        

            
//            addPoint(_x,(int)( _y - (Math.sin(0.628319)*_width)));
//           
//            addPoint((int)(_x + Math.cos(0.628319)*_width-Math.cos(1.25664)*_width) , (int)(_y + Math.sin(1.25664)*_width) );
//            
//            addPoint((int)(_x - (Math.cos(0.628319)*_width) ) , _y );
//                       
//            addPoint((int)(_x + (Math.cos(0.628319)*_width) ) , _y );
//                       
//            addPoint((int)(_x - Math.cos(0.628319)*_width+Math.cos(1.25664)*_width) , (int)(_y + Math.sin(1.25664)*_width) );
//            
            
            

        this.color = _color;
        this.relleno = _relleno;
        
        contorno = new BasicStroke(_grosor);
 
    }
 
    public void pintaYColorea(Graphics2D g2) {
        g2.setStroke(contorno);
        g2.setColor(this.color);
        if (this.relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
}
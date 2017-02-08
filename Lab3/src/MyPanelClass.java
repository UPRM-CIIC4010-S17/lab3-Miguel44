
import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

 

public class MyPanelClass extends JPanel {

    /**

* 

*/

private static final long serialVersionUID = 7057541440811488699L;


public void paintComponent(Graphics g) 

    {

        super.paintComponent(g);


        //Compute interior coordinates

        Insets myInsets = this.getInsets();

        int x1 = myInsets.left;

        int y1 = myInsets.top;

        int x2 = getWidth() - myInsets.right - 1;

        int y2 = getHeight() - myInsets.bottom - 1;

        int width = x2 - x1;

        int height = y2 - y1;


        //Paint the background

        g.setColor(Color.RED);

        g.fillRect(x1, y1, width+1, height+1);

//        g.setColor(Color.RED);
//
//        g.drawRect(x1, y1, width, height);
//        
        g.setColor(Color .BLACK);
       
        g.drawRect(x1+10,y2-280, width-130, height-170);
//
        g.setColor(Color.BLUE);
        Polygon q = new Polygon();

        q.addPoint(x1+10,y2-280);
        q.addPoint(x1+90,y1+170/2);
        q.addPoint(x1+10, y2-151);
        g.setColor(Color.BLUE);
        g.fillPolygon(q);
        
        Polygon s = new Polygon();
        s.addPoint(x1+70, y2-90);
        s.addPoint(x1+279, y2-200);
        s.addPoint(x1+279, y2-150);
        g.setColor(Color.WHITE);
        g.fillPolygon(s);
        

        
//        
//        g.setColor(Color.BLUE);
//
//        g.fillOval(width/2-55/2,height/2-55/2,55,55);
        Polygon p = new Polygon();
        p.addPoint(x1 + 5, y1 + 25);
        p.addPoint(x1 + 20, y1 + 10);
        p.addPoint(x1 + 35, y1 + 25);
        p.addPoint(x1 + 25, y1 + 25);
        p.addPoint(x1 + 25, y1 + 45);
        p.addPoint(x1 + 15, y1 + 45);
        p.addPoint(x1 + 15, y1 + 25);
        g.setColor(Color.BLACK);
//        g.fillPolygon(p);
        Polygon p2 = new Polygon();
        p2.addPoint(x1 + 25, y1 + 73);
        p2.addPoint(x1 + 41, y1 + 73);
        p2.addPoint(x1 + 47, y1 + 58);
        p2.addPoint(x1 + 53, y1 + 73);
        p2.addPoint(x1 + 69, y1 + 73);
        p2.addPoint(x1 + 56, y1 + 83);
        p2.addPoint(x1 + 61, y1 + 98);
        p2.addPoint(x1 + 47, y1 + 88);
        p2.addPoint(x1 + 34, y1 + 98);
        p2.addPoint(x1 + 38, y1 + 83);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
    }

}



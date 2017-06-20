import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Square
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new square at default position with default color.
     */
    public Square(int x,int y, int s, String c)
    {
        size = s;
        xPosition = x;
        yPosition = y;
        color = c;
        isVisible = false;
    }


    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }


    /*
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        
    }

    /*
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}

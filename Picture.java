/**
 * This class represents a simple picture. It's just a guy standing in front of
 * a house that does not have a door. He is on his way to Lowes to go buy a door.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Daniel Zetterstrom
 * @version 02.03.2020
 */
public class Picture
{
    private Square house;
    private Person man;
    private Triangle roof;
    private Square ground;
    private Square doorTop;
    private Square doorBottom;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        house = new Square();
        doorTop = new Square();
        doorBottom = new Square();
        man = new Person();
        ground = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            house.setPosition(20, 70);
            house.changeSize(175);
            house.changeColor("blue");
            house.makeVisible();
            
            ground.setPosition(-210, 245);
            ground.changeSize(1000);
            ground.changeColor("green");
            ground.makeVisible();
            
            doorTop.setPosition(110, 120);
            doorTop.changeColor("black");
            doorTop.makeVisible();
            
            doorBottom.setPosition(110, 180);
            doorBottom.changeColor("black");
            doorBottom.makeVisible();
            
            sun.setPosition(450, -10);
            sun.changeColor("yellow");
            sun.makeVisible();
            
            man.setPosition(280, 205);
            man.makeVisible();
            
            roof.changeSize(100, 175);
            roof.setPosition(105, -30);
            roof.changeColor("yellow");
            roof.makeVisible();
            
            drawn = true;
        }
    }
    
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        house.changeColor("black");
        roof.changeColor("black");
        doorTop.changeColor("white");
        doorBottom.changeColor("white");
        ground.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        house.changeColor("blue");
        roof.changeColor("yellow");
        doorTop.changeColor("black");
        doorBottom.changeColor("black");
        ground.changeColor("green");
        sun.changeColor("yellow");
    }
}

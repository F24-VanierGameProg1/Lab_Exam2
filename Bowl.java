import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Bowl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bowl extends SimulationActor
{

    public int redApplesCounter = 0;
    public int yellowApplesCounter = 0;

    public Bowl()
    {
        super();

        alignWithVector(new Vector2D(0.0, 0.0));
        acceleration = new Vector2D(0.0, 0.4);
    }

    public void act() 
    {
        super.act();

        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null)
        {
            Point2D mouseWindowPos = new Point2D(mouse.getX(), mouse.getY());
            Point2D mouseWorldPos = windowToWorld(mouseWindowPos);
            position.setX(mouseWorldPos.getX());

        }

        eatAppleOnCollision();

    }  

    public void eatAppleOnCollision()
    {
        GreenfootSound sound;   

        SimulationWorld world = (SimulationWorld) getWorld();
        List<Apple> apples = world.getObjects(Apple.class);

        
        
        
        
 
    }

}

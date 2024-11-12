import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private double score = 0;
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        SimulationWorld world = (SimulationWorld) getWorld();
        
        List<Bowl> bowls = world.getObjects(Bowl.class);
        
        if (bowls.size() <= 0)
        {
            return;
        }
                
        Bowl bowl= world.getObjects(Bowl.class).get(0);
        
        if (bowl != null)
        {
            score = bowl.position.getY() + 5;

            
        }
        
        setImage(new GreenfootImage("Score: " + (int) score + " ",30 , Color.WHITE, Color.BLACK, Color.YELLOW));
        
    }  
    
    public double getScore()
    {
        return score;
    }

    
}

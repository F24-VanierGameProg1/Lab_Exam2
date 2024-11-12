import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreenWorld extends SimulationWorld
{


    /**
     * Constructor for objects of class EndScreenWorld.
     * 
     */
    public EndScreenWorld(double vscore)
    {
        super("",  800, 600, new Point2D(0.0, 0.0), 10);

        Score result = new Score();
        addObject(result, 400, 320);
        result.setImage(new GreenfootImage("You finished with a score of " + (int) vscore + ".", 40, Color.WHITE, Color.BLACK, Color.YELLOW));;

        Score feedback = new Score();
        addObject(feedback,400,380);

        String ranking = new String();
  
        feedback.setImage(new GreenfootImage("You are " + ranking + ".", 40, Color.BLUE, Color.BLACK, Color.YELLOW));

    }
    
    public void act()
    {

 
        
         

    }
}
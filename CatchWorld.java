import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class CatchWorld extends SimulationWorld
{
    GreenfootSound music;
    double timeGameStart = System.currentTimeMillis() ;

    public CatchWorld()
    {    
        super("", 800, 600, new Point2D(0.0, 0.0), 20);
        music = new GreenfootSound("gamePlay.wav");
        setMusic(music);

        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();       
        prepare();

    }

    public void act()
    {
        super.act();

        List<Bowl> bowls = getObjects(Bowl.class);
        if (bowls.size() > 0)
        {
            Bowl player = bowls.get(0);
            cameraCenter.setY(player.getPosition().getY() + 6.0);
        }

        if (System.currentTimeMillis() >= timeGameStart + 30000)
        {
            transitionToWorld(new EndScreenWorld(0)); 
        }

    }
    private void prepare()
    {
        Bowl bowl = new Bowl();
        addObject(bowl,400,500);
        bowl.setLocation(400,540);

        // Generate apples for 20 screens
        for (int i = 0; i < 12000; i+=60)
        {
            int xPos = 40 + 60*Greenfoot.getRandomNumber(13);


            // get random number 1 or 2 for adding apples (appleCategory 1 for Red Apple, appleCategory 2 for Yellow Apple)
            int appleCategory = Greenfoot.getRandomNumber(2)+1;
            addObject(new Apple(appleCategory), xPos, -i);
            
            
        }

        Score score = new Score();
        addObject(score,725,36);
    }
}

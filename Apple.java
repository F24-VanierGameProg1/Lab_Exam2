import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends SimulationActor
{

    public int appleColor = 0;

    public Apple(int v_appleColor)
    {
        setRotation(Greenfoot.getRandomNumber(360));

        if (v_appleColor == 1)
        {
            setImage("redApple.png");
            appleColor = 1;
            
        } else
        if (v_appleColor == 2)
        {
            setImage("yellowApple.png");
            appleColor = 2;
        }

    }

    public void act() 
    {
        super.act();

        if (getY() > 630)
        {
            position.setY(position.getY() + 300.0);
        } 

    }    
}

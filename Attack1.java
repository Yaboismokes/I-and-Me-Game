import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack1 extends Boss1
{
    private GifImage gif = new GifImage("Attack1.gif");
    /**
     * Act - do whatever the Attack1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(gif.getCurrentImage());
    }
}

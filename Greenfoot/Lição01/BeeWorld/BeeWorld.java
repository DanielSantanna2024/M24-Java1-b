import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da Abelha no jogo
 * 
 * @author Daniel de Sant'Anna Almeida 
 * @version 20-04-2024
 */
public class BeeWorld extends World
{
    //campos e fields
    private Abelha abelha = null;
    
    /**
     * Constructor da classe BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,55,60);
        
        Aranha aranha = new Aranha();
        addObject(aranha,509,152);
        //utilizando o For para criar moscas
        for(int i=0; i<20; i++){
            int pX = Greenfoot.getRandomNumber(getWidth());
            int pY = Greenfoot.getRandomNumber(getHeight());
            int vel = Greenfoot.getRandomNumber(5)+1;
            int ang = Greenfoot.getRandomNumber(360);
            
            addObject(new Mosca(vel,ang),pX, pY);
        }
        Mosca mosca = new Mosca();
        addObject(mosca,208,332);
    }
    
    
    public Abelha getAbelha(){
        return abelha;
    
    }
}

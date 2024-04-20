import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da Abelha no jogo
 * 
 * @author Daniel de Sant'Anna Almeida 
 * @version 20-04-2024
 */
public class BeeWorld extends World
{

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
        Abelha abelha = new Abelha();
        addObject(abelha,55,60);
        Aranha aranha = new Aranha();
        addObject(aranha,509,152);
        Mosca mosca = new Mosca();
        addObject(mosca,208,332);
    }
}

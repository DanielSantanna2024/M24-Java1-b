import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Daniel de Sant'Anna 
 * @version 20-04-2024
 */
public class Abelha extends Actor
{
    /**
     * Método Act é executado sempre que apertamos o botão Act ou ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Se teclar para a esquerda, gira -10°
        if(Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        //Se teclar para direita, gira 10°
        if(Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }
}

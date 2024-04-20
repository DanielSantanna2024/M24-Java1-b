import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Aranha destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Daniel de Sant'Anna 
 * @version 20-04-2024
 */
public class Aranha extends Actor
{
    /**
     * Método Act é executado sempre que apertamos o botão Act ou ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Verifica se o número aleatório de 1 a 100 está menor ou igual a 10
        if (Greenfoot.getRandomNumber(100)+1 <= 10) {
            //Adiciona aleatóriamente de -45 a 45° para rotacionar
            turn(Greenfoot.getRandomNumber(91)-45);
        }
    }
}

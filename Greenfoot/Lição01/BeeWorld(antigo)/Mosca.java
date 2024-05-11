import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Daniel de Sant'Anna 
 * @version 20-04-2024
 */
public class Mosca extends Actor
{
    //Campos e Fields
    private int velocidade;
    //Constructor padrão (Não recebe parâmetros)
    public Mosca(){
        velocidade =1;
    }
    public Mosca (int vel, int ang){
        velocidade = vel;
        setRotation(ang); //colocando o ângulo que eu passar
    
    }
    /**
     * Método Act é executado sempre que apertamos o botão Act ou ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        //verificarCanto();
        if (isAtEdge()) {
            turn(180);
        }
        //(isTouching(Mosca.class ) ) {
        int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
        int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
        
    }
         
    }
    
    
    




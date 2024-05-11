import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Daniel de Sant'Anna 
 * @version 20-04-2024
 */
public class Abelha extends Actor
{
    //Constantes
    public static final int PONTOS = 100;
    //Campos ou Fileds
    public int vidas = 0;
    public int score = 0;
    //criando campo do tipo conjunto de imagens
    private GreenfootImage[] imagens;
    //Constructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //definir o tamanho do conjunto
        imagens = new GreenfootImage[4];
        //definir imagens
        for (int i=0;1<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(1+1)+".png");
        }
    }
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
        //vidas
        getWorld().showText("Vidas: " + vidas, 60, 20);
        getWorld().showText("Score: " + score, 700, 20);
        
        //game over
        if (isTouching(Aranha.class)){
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--;
            if (vidas<1) {
                Greenfoot.stop();
                getWorld().showText("GAME OVER", 400, 300);
                
            }
        }
    
    }
    public void capturadaPelaAranha(){
        if (isTouching(Aranha.class)){
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--;
            if (vidas<1) {
                Greenfoot.stop();
                getWorld().showText("GAME OVER", 400, 300);
                
            }
        }
    
    }
    
    public void mostrarVidas(){
        getWorld().showText("Vidas: " + vidas, 60, 20);
    }
    
    public void mostrarScore(){
        getWorld().showText("Score: " + score, 700, 20);
    
    }
   
}

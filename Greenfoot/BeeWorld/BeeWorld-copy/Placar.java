import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe vai representar um placar no jogo BeeWorld
 * 
 * @author Daniel de Sant'Anna 
 * @version 11-05-2024
 */
public class Placar extends Actor
{
    //Fields ou Campos ou Variáveis de Instância
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    //Constructor
    public Placar(){
        texto = "Score: 0";
        tamanhoTexto = 32;
        corFonte = Color.BLUE;
        //corFonte = new Color(0,0,255,100);
        atualizarImagem();
    }
    //Getters (acessadores de campos) e Setter (modificadores de campos)
    public String getTexto(){
        return texto;
    }
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(),tamanhoTexto);
        img.setColor(corFonte);
        //                  Nomefonte,bold,italic, tamanho
        img.setFont(new Font("Arial",true,false,tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img); 
    }
    
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}

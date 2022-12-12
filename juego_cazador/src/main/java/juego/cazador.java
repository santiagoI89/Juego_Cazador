package juego;
import java.util.Random;
import java.util.Scanner;

public class cazador extends personaje
{
    private int disparo;

    public int getDisparo() {
        return disparo;
    }
    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }
    public cazador()
    {

    }
    public cazador(int disparo)
    {
        this.disparo=disparo;
    }
    Scanner ingreso = new Scanner(System.in);

    Random randomico = new Random();
    
    @Override
    public void elejirLado() 
    {
        System.out.println("Seleccione un lado para cazar al zorro");
        System.out.println("Digite 1 para disparar al arbol del lado derecho");
        System.out.println("Digite 2 para disparar al arbol del lado izquierdo");
        System.out.println("Digite 3 para disparar al arbol de la mitad");
        setDisparo(ingreso.nextInt());
    }
    public void determinarGanador() 
    {
        int zorro = 1 +randomico.nextInt(3);
        if(getDisparo()<1)
        {
            System.out.println("No se puede digitar un numero negativo");
        }
        else if(getDisparo()>3)
        {
            System.out.println("La opcion digitada no esta en nuestro menu");
        }
        else if(getDisparo()==zorro)
        {
            System.out.println("Zorro ejecutado");
        }
        else 
        {
            System.out.println("Disparo fallido, el zorro ha huido");
        }
    }
}

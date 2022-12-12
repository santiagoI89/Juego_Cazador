package juego;
import java.util.Random;
import java.util.Scanner;


public class zorro extends personaje
{
    private int salida;

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }
    public zorro()
    {

    }
    public zorro(int salida)
    {
        this.salida=salida;
    }
    Scanner ingreso = new Scanner(System.in);
    Random randomico = new Random();
    @Override
    public void elejirLado() 
    {
        System.out.println("Seleccione un lado para escapar del cazador");
        System.out.println("Digite 1 para salir por el arbol del lado derecho");
        System.out.println("Digite 2 para salir por el arbol del lado izquierdo");
        System.out.println("Digite 3 para salir por el arbol de la mitad");
        setSalida(ingreso.nextInt());
        
    }
    public void determinarGanador() 
    {
        int cazador = 1 +randomico.nextInt(3);
        if(getSalida()<1)
        {
            System.out.println("No se puede digitar un numero negativo");
        }
        else if(getSalida()>3)
        {
            System.out.println("La opcion digitada no esta en nuestro menu");
        }
        else if(getSalida()==cazador)
        {
            System.out.println("Has muerto");
        }
        else 
        {
            System.out.println("Disparo fallido, puedes huir");
        }
        
    }
}

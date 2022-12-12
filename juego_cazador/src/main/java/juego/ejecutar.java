package juego;
import java.util.Scanner;
public class ejecutar 
{
    public static void main(String[] args) 
    {
        Scanner ingreso = new Scanner(System.in);
        cazador mycazador = new cazador(0);
        zorro myzorro = new zorro(0);
        
        int seguir=0,seleccion;

        do{
            System.out.println("..............Jungle.............");
            System.out.println("Escoja uno de los dos personajes que ofrecemos\nDigite 1 para cazador\nDigite 2 para zorro");
            seleccion=ingreso.nextInt();
            switch(seleccion)
            {
                case 1:
                {                   
                    mycazador.elejirLado();
                    mycazador.determinarGanador();
                    break;
                }
                case 2:
                {
                    myzorro.elejirLado();
                    myzorro.determinarGanador();
                    break;
                }
                default:
                {
                    System.out.println("Ingreso incorrecto");
                    break;
                }
            }
          System.out.println("Digte 1 para continuar o cualquier otro numero para salir");
          seguir=ingreso.nextInt();
        }while(seguir==1);
        ingreso.close();
    }
}
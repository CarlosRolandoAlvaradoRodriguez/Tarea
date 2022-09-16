package Tarea;

public class MainEcuaciones
{
    public static void main(String[] args)
    {
    EcuacionCuadratica ecuacion = new EcuacionCuadratica(2,4,-6);

   ecuacion.setA(5);
   ecuacion.setB(2);
   ecuacion.setC(-7);

    //System.out.println("ECUACIONES DE SEGUNDO GRADO ");
    //System.out.println("Valor A: " + ecuacion.getA());
    //System.out.println("Valor B: " + ecuacion.getB());
    //System.out.println("Valor C: " + ecuacion.getC() + "\n");
    //System.out.println(ecuacion.solucion());
        ecuacion.mostrar();
    }
}

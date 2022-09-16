package Tarea;

public class EcuacionCuadratica
{
    public double a;
    public double b;
    public double c;

    public EcuacionCuadratica(double numa, double numb, double numc) {
        a = numa;
        b = numb;
        c = numc;
    }

    public double getA() {
        return a;
    }

    public void setA(double numa) {
        a = numa;
    }

    public double getB() {
        return b;
    }

    public void setB(double numb) {
        b = numb;
    }

    public double getC() {
        return c;
    }

    public void setC(double numc) {
        c = numc;
    }


    public double discriminante(){
        double expresion;
        expresion = Math.pow(getB(),2)-(4*getA()*getC());

        return expresion;
    }

    public double solucion(){
        double respuesta1;

        if (discriminante() > 0){
            System.out.println("2 soluciones");
            double respuesta2;

            respuesta1=(-getB()+Math.sqrt(discriminante()))/(2*getA());
            respuesta2=(-getB()-Math.sqrt(discriminante()))/(2*getA());

            System.out.println("X = " + respuesta1);
            System.out.println("X = " + respuesta2);
        } else if (discriminante() == 0) {
            System.out.println("1 soluciones");

            respuesta1 =(-getB())/(2*getA());
            System.out.println("X = " + respuesta1);

        } else {
            System.out.println("Ninguna solucion");
        }
        return 0;
    }
    public void mostrar()
    {
        System.out.println("ECUACIONES DE SEGUNDO GRADO ");
        System.out.println("Valor A: " + getC());
        System.out.println("Valor B: " + getB());
        System.out.println("Valor C: " + getC() + "\n");
        System.out.println(solucion());
    }

}

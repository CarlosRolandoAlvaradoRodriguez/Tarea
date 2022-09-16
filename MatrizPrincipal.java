package Tarea;

public class MatrizPrincipal
{
    public int Fila;
    public int Columna;

    public MatrizPrincipal(int fil, int col) {
        Fila = fil;
        Columna = col;

    }

    public int getFila() {
        return Fila;
    }

    public void setFila(int fil) {
        Fila = fil;
    }

    public int getColumna() {
        return Columna;
    }

    public void setColumna(int col) {
        Columna = col;
    }
    public int[][] Matriz()
    {
        int[][] matriz = new int[getFila()][getColumna()];

        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j ++) {
                matriz[i][j] = (i *getFila()) + (j + 1);
            }
        }
        return matriz;
    }
    public void mostrarMatriz(){
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++){
                System.out.print("["+Matriz()[i][j]+" ]" );
            }


                System.out.println("    ");
            }

         }

}

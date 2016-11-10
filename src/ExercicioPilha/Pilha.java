package ExercicioPilha;

/**
 * Created by Douglas Maciel on 30/08/2016.
 */
public class Pilha {
    int vetor[] = new int[10];
    int topo;

    public void isInit() {
        this.topo = -1;
    }

    public boolean push(int valor) {
        if (topo > 9) {
            System.out.println("Windows ME.");
            return false;
        }
        this.topo++;
        this.vetor[this.topo] = valor;
        System.out.println("Parabens");
        return true;
    }



    }
}

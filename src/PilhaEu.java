/**
 * Created by Douglas on 04/10/2016.
 */
public class PilhaEu {
    public int topo;
    public int vet[];

    public PilhaEu(int tamanho) {
        vet = new int[tamanho];
        topo = -1;
    }

    public boolean Cheio() {
        if (topo >= vet.length - 1) {
            System.out.println("Cheio");
        }
        return true;
    }

    public boolean Vazio() {
        if (topo <= -1) {
            return true;
        }
        return false;
    }

    public void push(int valor) {
        if (!Cheio()) {
            topo++;
            vet[topo] = valor;
            System.out.println("O valor " + vet[topo] + " foi adicionado na posição " + topo);
        } else {
            System.out.println("Pilha esta cheia!!");
        }
    }

    public int pop() {
        int a = 0;
        if (Vazio()) {
            System.out.println("Pilha esta vazia!!");
        } else {
            System.out.println("Foi removido o valor " + vet[topo] + "da posicao " +topo);
            a = topo;
            vet[topo] = 0;
            topo--;
        }
        return vet[a];
    }
}

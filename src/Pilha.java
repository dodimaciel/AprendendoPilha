/**
 * Created by Douglas on 04/10/2016.
 */
public class Pilha {
    private int topo;
    private int vetor[];

    public Pilha(int tamVetor){
        vetor = new int[tamVetor];
        topo = -1;
    }


    boolean isFull(){
        if(topo >= vetor.length-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(topo <= -1){
            return true;
        }else{
            return false;
        }
    }

    void pull(int valor){
        vetor[topo] = valor;
        topo++;
    }

    void  push(int valor){
        if(!isFull()){
            topo++;
            vetor[topo] = valor;
            System.out.println("\"** Foi adicionado o valor "+vetor[topo] +" na posicao "+topo);
        }else{
            System.out.println("############### Pilha Cheia ###############");
        }
    }

    int pop(){
        int temp = 0;
        if(isEmpty()){
            System.out.println("############### Pilha Vazia ###############");
        }else{
            System.out.println("\"** Foi removido o valor "+vetor[topo] +" da posicao "+topo);
            temp = topo;
            vetor[topo] = 0;
            topo--;
        }
        return vetor[temp];
    }

    int mostrarTopo(){
        int temp = 0;
        if(!isEmpty()){
            temp = topo;
        }
        System.out.println("----> O valor que esta no topo da pilha e: "+vetor[temp]);
        return vetor[temp];
    }

    void listarPilha(){
        if(!isEmpty()){
            System.out.print("---> ");
            for (int i = 0; i <= topo+1; i++) {
                System.out.print(""+vetor[i]+" ");
            }
            System.out.println("");
        }
    }
}

package ExercicioPilha;

/**
 * Created by Douglas Maciel on 30/08/2016.
 */
public class TestaPilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.isInit();
        System.out.println(minhaPilha.topo);
        minhaPilha.push(4);
    }
}

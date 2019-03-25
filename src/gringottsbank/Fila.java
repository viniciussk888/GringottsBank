package gringottsbank;

public class Fila {

    Senha fila[] = new Senha[1000];
    int ultimaPosicaoOcupada = 0;

    public void inserir(Senha x) {
        fila[ultimaPosicaoOcupada] = x;
        subir(ultimaPosicaoOcupada);
        ultimaPosicaoOcupada++;

    }

    public void subir(int i) {
        int j = i % 2 == 0 ? i / 2 - 1 : i / 2;

        if (j >= 0) {
            if (fila[i].tipo < fila[j].tipo) {
                Senha aux = fila[i];
                fila[i] = fila[j];
                fila[j] = aux;
                subir(j);
            }

        }

    }
}

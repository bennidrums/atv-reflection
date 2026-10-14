import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Constructor;

public class ReflectionLista {

    private List<String> lista;

    public ReflectionLista() throws Exception {
        Class<ArrayList> classe  = ArrayList.class;

        Constructor<ArrayList> constructor = classe.getConstructor();

        lista =(ArrayList<String>) constructor.newInstance();
    }

    public void adicionar(String valor) throws Exception {
        Class<?> classe = lista.getClass();

        java.lang.reflect.Method metodoAdd =
                classe.getMethod("add", Object.class);

        metodoAdd.invoke(lista, valor);
    }

    public void exibirLista() throws Exception {
        java.lang.reflect.Method metodoIterator =
                lista.getClass().getMethod("iterator");
        Object iterator = metodoIterator.invoke(lista);


        Class<?> classeIterator = java.util.Iterator.class;

        java.lang.reflect.Method hasNext =
                classeIterator.getMethod("hasNext");

        java.lang.reflect.Method next = classeIterator.getMethod("next");

        while((boolean) hasNext.invoke(iterator)) {
            Object valor = next.invoke(iterator);
            System.out.println(valor);
        }
    }

    public static void main(String[] args) throws Exception {
        ReflectionLista exemplo = new ReflectionLista();

    exemplo.adicionar("Alice Liddell");
    exemplo.adicionar("Chapeleiro Maluco");
    exemplo.adicionar("Gato de Cheshire");

    exemplo.exibirLista();

    }
}
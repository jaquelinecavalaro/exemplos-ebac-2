/**
 * @author jaquelinecavalaro
 */
public class Principal{
    /**
     * @param args
     */
    public static void main(String[] args){

        Cachorro cachorro = new Cachorro();

        //Metodo depreciado como pode ver na anotação do metodo
        //var acao = cachorro.latir();

        var acao = cachorro.latir1();

        System.out.println(acao);

        System.out.println(cachorro.abanarRabo(3));

    }
}
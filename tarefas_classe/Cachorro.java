public class Cachorro {
    
    /**
     * Retorna latido do cachorro
     * 
     * @return latido do cachorro
     * 
     * @deprecated
     * 
     * @see String latir1()
     */
    public void latir(){
        System.out.println("au-au");
    }
    public String latir1(){
        return "au-au";
    }
    /**
     * @return lambida do cachorro
     */
    public void lamber () {
        System.out.println("lambida, lambida");
    }
    /**
     * @return rabo abanando
     * <b>retorna abanada de rabo do cachorro</b>
     * 
     * 
     * <i>Adicione uma quantidade inteira para determinar a quantidade de abano de rabo do cachorro</i>
     */
    public String abanarRabo(int quantidade){
        return "Rabo abanou " + quantidade + " vezes!";
    }
}

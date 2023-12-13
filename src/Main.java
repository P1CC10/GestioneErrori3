public class Main {
    public static void main(String[]arg){
        try{
            int dividendo = 25;
            int divisore = 0 ;
            int risultato =divisionePerZero(dividendo,divisore);
            System.out.println("il risultato della divisione è=" + risultato);
        }catch (ArithmeticException e){
            System.out.println("Errore");
        }
    }
    public static int divisionePerZero(int dividendo, int divisore){
        int result = dividendo/divisore;
        return result;
    }
}

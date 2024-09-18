package dio.java.primeirasemana;
public class MinhaClasse {

public static void main (String [] args) {
    String primeiroNome = "Antonio";
    String segundoNome = "Adade de Castro";
    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
   return "O nome completo é " + primeiroNome.concat(" ").concat(segundoNome); 

}
    
}

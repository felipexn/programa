import java.util.Scanner;
public class teste{
public static void main(String[] args) {
    Receita a=new Receita();
    
    System.out.println("digite oq quer");
    Scanner entrada = new Scanner(System.in);
    String oque = entrada.nextLine();

    if(oque == "farofa"){
        System.out.println(a.farofa);
    }
}
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n ;
        int m ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor para n: ");
        n = scanner.nextInt();
        System.out.println("Informe numero para m: ");
          m = scanner.nextInt();
        int quantidadeNumerosDivisiveis = 0;
        for (int i = 1; i < 500; i++){
           if ( i % n == 0 && i % m != 0){

               System.out.println(i);
               quantidadeNumerosDivisiveis ++;

           }
        }
        System.out.println(quantidadeNumerosDivisiveis);
    }
}

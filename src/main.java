
import java.util.Scanner;

public class main{ 
    public static int acha_maior_valor(int[] numeros){
        if (numeros == null || numeros.length==0){
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio."); 
        }
 
        
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++){ 
            if (numeros[i] > maior){ 
                maior = numeros[i]; 
            }
        }
        return maior; 
    }
    
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 
        int[] numeros = new int[15];
    
        System.out.println("Digite 15 números inteiros: ");
        
        for (int i = 0; i < 15; i ++){
            numeros[i] = scanner.nextInt(); 
        }
        scanner.close();

        int maior_valor = acha_maior_valor(numeros); 
        System.out.println("O maior valor é: " + maior_valor); 

    }
}   

import java.util.Scanner; 

class IsabellaQ1 {  
  public static void main(String args[]) { 
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Digite um numero");
    int n = myObj.nextInt(); 
    int resultado = 0;
    int calculo = 0;
    int i;
    for(i = 0; i < n + 1; i++){
      calculo = i + resultado;
      resultado = calculo;  
    };
  System.out.println("A soma dos elementos de 0 ate " + n + 
  " é: " + resultado);   
  } 
}

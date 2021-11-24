package EX_IF_ELSE.src;

// IF, ELSE IF, ELSE

// EXERCÍCIO: Escreva um programa que faça a validação do login de um usuário, considere que o nome de usuário 
// correto é "usuarioAutenticado123" e a senha correta é "senhaAutenticada123"
// O programa deverá retornar uma das seguintes mensagens:
// LOGIN INCORRETO caso a senha esteja certa e o usuário errado.
// SENHA INCORRETA caso a senha esteja errada e o usuário certo.
// ACESSO NEGADO caso usuário e senha estejam errados.
// ACESSO PERMITIDO caso usuário e senha estejam corretos.

import java.util.Scanner;

public class A02EX04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scan.next();

        System.out.print("Senha: ");
        String senha = scan.next();

        if(usuario.equals("usuarioAutenticado123") && senha.equals("senhaAutenticada123")){
            System.out.print("ACESSO PERMITIDO");
        } else if(usuario.equals("usuarioAutenticado123") && senha != "senhaAutenticada123"){
            System.out.print("SENHA INCORRETA");
        } else if(usuario != ("usuarioAutenticado123") && senha.equals("senhaAutenticada123")){
            System.out.print("LOGIN INCORRETO");
        } else {
            System.out.print("ACESSO NEGADO");
        }

        scan.close();
    }
}

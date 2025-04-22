public class SenhaMain {
    public static void main(String[] args) {
        ValidadorSenha validador = new ValidadorSenha();

        String senha = "Senha123";
        System.out.println("Senha "" + senha + "" é válida? " + validador.validar(senha));
    }
}

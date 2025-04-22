public class ValidadorSenha {

    public boolean validar(String senha) {
        return temTamanhoMinimo(senha) &&
               contemNumero(senha) &&
               contemMaiuscula(senha);
    }

    private boolean temTamanhoMinimo(String senha) {
        return senha.length() >= 8;
    }

    private boolean contemNumero(String senha) {
        return senha.matches(".*\\d.*");
    }

    private boolean contemMaiuscula(String senha) {
        return senha.matches(".*[A-Z].*");
    }
}

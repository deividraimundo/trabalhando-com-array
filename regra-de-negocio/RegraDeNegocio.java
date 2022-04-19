
public class RegraDeNegocio {

    public Funcionario[] retornoArrayNumerosPares(Funcionario[] arrayFunc) {
        Funcionario[] arrayNums = new Funcionario[3];
        try {

            for (int i = 0; i < 3; i++) {

                Funcionario f = arrayFunc[i];
                if (f.getEndereco().getNumero() % 2 == 0) {
                    arrayNums[i] = f;
                }

            }
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }

        return arrayNums;

    }

}

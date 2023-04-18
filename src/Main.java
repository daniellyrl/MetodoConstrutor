public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João",10,"sistemas");
        System.out.println("O nome do aluno é: " + a1.getNome() + " sua idade é: " + a1.getIdade() +
                " e sua matricula é: " + a1.getMatricula());
    }
}
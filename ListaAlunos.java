import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> alunos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite as informações do aluno " + (i + 1) + ":");
            System.out.println("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.println("Matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.println("Data de nascimento do aluno (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            alunos.add(new String[]{nome, matricula, dataNascimento});
        }

        // Exibindo os alunos cadastrados
        System.out.println("Alunos cadastrados:");
        for (String[] aluno : alunos) {
            System.out.println("Nome: " + aluno[0] + ", Matrícula: " + aluno[1] + ", Data de Nascimento: " + aluno[2]);
            //System.out.println(Collections.sort(alunos);

            String
            System.out.println("O terceiro aluno dos alunos cadastrados é " + alunos.get(1));

            String alunoEgresso = alunos.remove(0);
            System.out.println("O aluno " + alunoEgresso + " é considerado egresso");


        }
    }
}
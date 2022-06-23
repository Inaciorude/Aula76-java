public class ListGrades{


    public static void main(String[] args) {
        
        double grades [] = {50,60,40,80,20,100,50,100};
                          // 0, 1, 2, 3, 4, 5

        double total = 0;
        double media = 0;


        System.out.println("Quantidade de notas:" + grades.length);
        System.out.println();

        for (int i = 0; i < grades.length; i++) {

            System.out.println("Nota na posição " + i + ": " + grades[i]);
            total += grades[i];
            System.out.println("Total parcial: " + total);

        }

        media = total/grades.length;

        if (media < 60) {
            System.out.println("Reprovado com média:" + media);
        } else {
            System.out.println("Aprovado com média:" + media);
        }

    }

}

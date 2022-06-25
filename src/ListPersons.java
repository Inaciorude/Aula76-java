public class ListPersons {
    
    public static void main(String[] args) {
        
        String persons[] = {"Joao","Maria","Joana"};

        int i = 10;
        do {

            if(i > persons.length){
                System.out.println("Indice invalido");
                break;
            }

            System.out.println(persons[i]);
            i++;
        } while (i<persons.length);

    }
}

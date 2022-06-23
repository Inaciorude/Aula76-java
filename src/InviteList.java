public class InviteList {
    
    public static void main(String[] args) {
        
        String[] persons = {"John", "Johnnathan", "Johny", "Johnas", "Johnielson", "Johnson"};

        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);
           

        }

        


        System.out.println();

        int i = 0;
        for (String person : persons) {

            System.out.println(person);
            
            System.out.println(i);

            i++;

        }

    }

}

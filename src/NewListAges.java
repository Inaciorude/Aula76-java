public class NewListAges {
    
    public static void main(String[] args) {
        
        int ages[] = {11,4,20,19,13,14,12,18,22,13};

        for (int i = 0; i < ages.length; i++) {

            if(ages[i] < 18){
                continue;
            }

            System.out.println(ages[i]);
        }

    }

}

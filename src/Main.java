public class Main {
    public static void main(String[] args) {
        Juma juma=Juma.Monday;
        Juma juma1=Juma.Tuesday;
        Juma juma2=Juma.Wednesday;
        Juma juma3=Juma.Thursday;
        Juma juma4=Juma.Friday;
        Juma juma5=Juma.Saturday;
        Juma juma6=Juma.Sunday;


        String[]j={String.valueOf(juma),String.valueOf(juma1),String.valueOf(juma2),String.valueOf(juma3),String.valueOf(juma4),String.valueOf(juma5),String.valueOf(juma6)};


        for (String juma7:j) {
            System.out.println(juma7);

        }
    }
}
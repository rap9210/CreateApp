public class CreateApp {
    public static void main (String[] args){
        String country = "Spain";
        String pop = "46.94 million";
        String cap = "Madrid";
        String dollar = "In Spain, the currency is the euro " +
                "and 0.91 euros are equivalent to $1.";
        System.out.println("Hola from Europe parental units, in case you" +
                " were wondering some random facts you could otherwise" +
                " google, here yo go:");
        System.out.println("Country: "+ country);
        System.out.println(country +" population: "+ pop);
        System.out.println(cap +" is the capital city of "+ country);
        System.out.println(dollar);
        System.out.println("So there you go. You have been educated.");
    }
}

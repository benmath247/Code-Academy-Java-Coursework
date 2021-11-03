package languageFamilies;

public class Language {
    protected String name, regionsSpoken, wordOrder;
    protected int numSpeakers;

    public Language(String name, int numSpeakers) {
        this.name = name;
        this.numSpeakers = numSpeakers;
    }

    public Language(String name, String regionsSpoken, String wordOrder, int numSpeakers) {
        this.name = name;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
        this.numSpeakers = numSpeakers;
    }

    public void getInfo(){
        System.out.println(name + " is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+". \n"+
                "The language follows the word order: "+wordOrder+".");
    }

    public static void main(String[] args){
        Language testing = new Mayan("Kechua", 1000000);
        testing.getInfo();
    }
}

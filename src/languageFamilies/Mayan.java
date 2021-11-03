package languageFamilies;

public class Mayan extends Language{

    public Mayan(String name,  int numSpeakers) {
        super(name, numSpeakers);
        this.regionsSpoken = "Central America";
        this.wordOrder = "verb-object-subject";
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fun fact: "+name+" is an ergative language");
    }
}

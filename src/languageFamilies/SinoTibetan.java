package languageFamilies;

public class SinoTibetan extends Language{
    public SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers);
        this.wordOrder = "subject-object-verb";
        this.regionsSpoken = "Asia";
        if (this.name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}

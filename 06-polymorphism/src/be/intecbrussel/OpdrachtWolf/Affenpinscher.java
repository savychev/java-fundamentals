package be.intecbrussel.OpdrachtWolf;

/**
 * Affenpinscher: huishond die alleen een Duitse roepnaam accepteert.
 */
public class Affenpinscher extends HomelyDog {
    private String color;
    private String nickname;

    public Affenpinscher(String name, int lifespan, char size, char coat, String color, String nickname) {
        super(name, lifespan, size, coat);
        this.color = color;
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (isGermanNickname(nickname))
            this.nickname = nickname;
        else
            System.out.println("The name of dog can only be German");
    }

    public boolean isGermanNickname(String nickname) {
        String[] arrGermanNicknames = {"Fritz", "Bruno", "Hans", "Otto", "Kaiser"};

        for (String name : arrGermanNicknames) {
            if (name.equals(nickname)) { // vergelijk met de kandidaat-roepnaam
                return true;
            }
        }

        return false; // geen Duitse naam gevonden
    }

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }
}

package be.intecbrussel.OpdrachtWolf;

public class Affenpinscher extends HomelyDog {
    private String color;
    private String nickname;

    public Affenpinscher(String name, int lifespan, char size, char coat, String color, String nickname) {
        super(name, lifespan, size, coat);
        this.color = color;
        this.nickname = nickname;
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
            if (name.equals(getName())) {
                return true;
            }
        }

        return true;
    }

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }
}

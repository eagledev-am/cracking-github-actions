public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getGoat(String player) {
        if(player.equalsIgnoreCase("Ronaldo")) {
            return "Ronaldo is the GOAT";
        } else if (player.equalsIgnoreCase("Messi")) {
            return "Messi is the GOAT";
        }
        else {
            return "Unknown player";
        }
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGoat("Messi"));
    }
}

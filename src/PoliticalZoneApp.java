import java.util.Scanner;

enum PoliticalZone {
    NORTH_CENTRAL,
    NORTH_EAST,
    NORTH_WEST,
    SOUTH_EAST,
    SOUTH_SOUTH,
    SOUTH_WEST
}

class State {
    String name;
    PoliticalZone zone;

    public State(String name, PoliticalZone zone) {
        this.name = name;
        this.zone = zone;
    }
}

public class PoliticalZoneApp {
    public static void main(String[] args) {
        State[] states = {
                new State("Abia State", PoliticalZone.SOUTH_EAST),
                new State("Adamawa State", PoliticalZone.NORTH_EAST),
                new State("Akwa Ibom State", PoliticalZone.SOUTH_SOUTH),
                new State("Anambra State", PoliticalZone.SOUTH_EAST),
                new State("Bauchi State", PoliticalZone.NORTH_EAST),
                new State("Bayelsa State", PoliticalZone.SOUTH_SOUTH),
                new State("Benue State", PoliticalZone.NORTH_CENTRAL),
                new State("Borno State", PoliticalZone.NORTH_EAST),
                new State("Cross River State", PoliticalZone.SOUTH_SOUTH),
                new State("Delta State", PoliticalZone.SOUTH_SOUTH),
                new State("Ebonyi State", PoliticalZone.SOUTH_EAST),
                new State("Edo State", PoliticalZone.SOUTH_SOUTH),
                new State("Ekiti State", PoliticalZone.SOUTH_WEST),
                new State("Enugu State", PoliticalZone.SOUTH_EAST),
                new State("Gombe State", PoliticalZone.NORTH_EAST),
                new State("Imo State", PoliticalZone.SOUTH_EAST),
                new State("Jigawa State", PoliticalZone.NORTH_WEST),
                new State("Kaduna State", PoliticalZone.NORTH_WEST),
                new State("Kano State", PoliticalZone.NORTH_WEST),
                new State("Katsina State", PoliticalZone.NORTH_WEST),
                new State("Kebbi State", PoliticalZone.NORTH_WEST),
                new State("Kogi State", PoliticalZone.NORTH_CENTRAL),
                new State("Kwara State", PoliticalZone.NORTH_CENTRAL),
                new State("Lagos State", PoliticalZone.SOUTH_WEST),
                new State("Nasarawa State", PoliticalZone.NORTH_CENTRAL),
                new State("Niger State", PoliticalZone.NORTH_CENTRAL),
                new State("Ogun State", PoliticalZone.SOUTH_WEST),
                new State("Ondo State", PoliticalZone.SOUTH_WEST),
                new State("Osun State", PoliticalZone.SOUTH_WEST),
                new State("Oyo State", PoliticalZone.SOUTH_WEST),
                new State("Plateau State", PoliticalZone.NORTH_CENTRAL),
                new State("Rivers State", PoliticalZone.SOUTH_SOUTH),
                new State("Sokoto State", PoliticalZone.NORTH_WEST),
                new State("Taraba State", PoliticalZone.NORTH_EAST),
                new State("Yobe State", PoliticalZone.NORTH_EAST),
                new State("Zamfara State", PoliticalZone.NORTH_WEST)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your state: ");
        String inputState = scanner.nextLine();

        boolean isFound = false;
        for (State state : states) {
            if (state.name.equalsIgnoreCase(inputState)) {
                System.out.println("Your state, " + state.name + ", belongs to the " + state.zone + " political zone.");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("State not isFound. Please check your input.");
        }

        scanner.close();
    }
}
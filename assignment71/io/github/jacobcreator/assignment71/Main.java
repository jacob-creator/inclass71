package io.github.jacobcreator.assignment71;


public class Main {

    public static void main(String[] args) {

        Character[] characters = new Character[] {
                new Warrior(12, "Gus"),
                new Warrior(100, "Frank"),
                new Wizard(1, "Twig"),
                new Wizard(75, "Nate"),
                new Archer(20, "Robin"),
                new Archer(60, "Hood")
        };

        StringBuilder output = new StringBuilder();

        for (Character character : characters) output.append(character.attack()).append('\n');

        System.out.print(output);

        characters[2].setLevel(2);

        System.out.print("\n" + characters[2].getName() + " levelled up! New level: " + characters[2].getLevel());

//        System.out.print("\n" + mainCharacter.attack());

    }

}

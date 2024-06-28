package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Medic extends Hero {

    public Medic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HEAL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int healingPoints = RPG_Game.random.nextInt(45)+5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() < 100 && heroes[i].getHealth() > 0 && !(heroes[i] instanceof Medic)) {
                heroes[i].setHealth(heroes[i].getHealth() + healingPoints);
                System.out.println("!" + heroes[i].getName() + " was healed by Medic at " + healingPoints + " health!");
                break;
            }
        }
    }

}

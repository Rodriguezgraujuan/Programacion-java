package POO4.Ej6;

import POO4.Ej5.Bardo;
import POO4.Ej5.Berserker;
import POO4.Ej5.Combatiente;
import POO4.Ej5.Druida;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static ArrayList<Combatiente> arrayAleatorio(ArrayList<Combatiente> battleRoyal) {
        Combatiente combatiente;
        for (int i = 0; i < 50; i++) {
            int randomNum = random.nextInt(0, 3);
            switch (randomNum) {
                case 1 -> combatiente = new Druida();
                case 2 -> combatiente = new Berserker();
                default -> combatiente = new Bardo();
            }
            battleRoyal.add(combatiente);
        }
        return battleRoyal;
    }



    public static void main(String[] args) {
        ArrayList<Combatiente> battleRoyal = new ArrayList<>();
        arrayAleatorio(battleRoyal);

        while (battleRoyal.size() > 1){
            int randomAttacker = random.nextInt(0,battleRoyal.size());
            int randomDefender = random.nextInt(0, battleRoyal.size());
            if (!(randomAttacker==randomDefender)) {
                Combatiente atacante = battleRoyal.get(randomAttacker);
                Combatiente defensor = battleRoyal.get(randomDefender);

                defensor.defender(atacante.atacar());
                if (!defensor.estaVivo()) {
                    battleRoyal.remove(randomDefender);
                }
            }
        }
        System.out.println("Ha ganado el " + battleRoyal.get(0));
    }
}

package domain;

import domain.contracts.FlyingType;
import domain.contracts.PoisonType;

public class Zobat extends Pokemon implements PoisonType, FlyingType{

    public Zobat(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void wingAtack() {
        System.out.printf("%s executou o ataque WingAtack!\n", getNick());
    }

    @Override
    public void sting() {
        System.out.printf("%s executou o ataque Sting!\n", getNick());
    }

    @Override
    public void attack() {
        wingAtack();
        sting();
    }
    
}

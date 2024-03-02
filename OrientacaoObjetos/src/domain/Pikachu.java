package domain;

import domain.contracts.ElectricType;

public class Pikachu extends Pokemon implements ElectricType {

    public Pikachu(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void thunderbolt() {
        System.out.printf("%s executou o ataque ThunderBolt!\n", getNick());
    }

    @Override
    public void attack() {
        thunderbolt();
    }

}

package domain;

import domain.contracts.FireType;

public class Charmander extends Pokemon implements FireType {

    public Charmander(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void ember() {
        System.out.printf("%s executou o ataque Ember!\n", getNick());
    }

    @Override
    public void attack() {
        ember();
    }
    
}

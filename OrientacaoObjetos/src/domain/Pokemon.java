package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Pokemon {
    private String nick;
    private int cp;
    private int hp;

    public void iCooseYou() {
        System.out.printf("%s eu escolho você!\n", nick);
    }

    public void comeBack() {
        System.out.printf("%s voltou para a PokeBall!\n", nick);
    }

    public abstract void attack();
}

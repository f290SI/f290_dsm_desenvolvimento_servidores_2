import java.util.List;

import domain.Charmander;
import domain.Pikachu;
import domain.Pokemon;
import domain.Zobat;
import domain.contracts.ElectricType;
import domain.contracts.FireType;
import domain.contracts.FlyingType;
import domain.contracts.PoisonType;

public class App {
    public static void main(String[] args) throws Exception {
        var pikachu = new Pikachu("Pikachu", 1500, 120);
        System.out.println(pikachu);
        pikachu.attack();

        var charmander = new Charmander("Charmander", 500, 90);
        System.out.println(charmander);
        charmander.attack();

        var zobat = new Zobat("Zobat", 800, 80);
        System.out.println(zobat);
        zobat.attack();

        // Demonstração do Polimorfismo
        List<Pokemon> pokemons = List.of(pikachu, charmander, zobat);
        String template = "\n%s. Detalhes de heraça e polimorfismo. \n"+ 
        "\tInstancia de Pokemon: %s.\n"+
        "\tInstancia de FireType: %s.\n"+
        "\tInstancia de EletricType: %s.\n"+ 
        "\tInstancia de PoisonType: %s.\n"+
        "\tInstancia de FlyingType: %s. \n\n";
        pokemons.forEach(p -> {
            System.out.printf(template, p.getNick(), 
            (p instanceof Pokemon),
            (p instanceof FireType),
            (p instanceof ElectricType),
            (p instanceof PoisonType),
            (p instanceof FlyingType));
            p.attack();
        });

        /*
         * Para o código de demosntração acima, estamos extraindo um novo objeto.
         * Cada objeto mediante o uso dos artificios da herança e polimorfismo,
         * podemos perceber que o Pokemon Zabat por exemplo, é descendente dos 
         * Pokemons e também possui os tipos polimórficos Poison e Flying.
         * Ao executar os ataques, o polimorfismo possibilita que o tipo correto
         * seja inferido em tempo de execução, mesmo desconhecendo o tipo devido
         * à complexidade da herança utilizada na família de de classes.
         */

    }
}

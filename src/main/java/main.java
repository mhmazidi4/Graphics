import Model.Animals.ProductiveAnimal;
import Model.Animals.WildAnimal;
import Model.Cell;
import Model.Factories.Factory;
import Model.Farm;
import Model.GameMenu.Game;
import Model.GameMenu.Missions.Mission;
import Model.Grass;
import Model.Item;
import Model.Positions.MapPosition;
import controller.InputProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        ArrayList<Mission.Goal.EE> ees = new ArrayList<>(0);
        ees.add(new Mission.Goal.EE(Item.getInstance("Egg").getItemInfo(), 5));
        ees.add(new Mission.Goal.EE(Item.getInstance("Horn").getItemInfo(), 10));
        Mission mission1 = new Mission(new Mission.Goal(ees));
        Farm farm1 = new Farm();
        farm1.factories[0] =new Factory(Factory.findFactoryType("Egg Powder Plant"),new MapPosition(0,0),null,0);
        farm1.factories[0].getFactoryType().setInputItems(new ArrayList<>(0));
        farm1.factories[0].getFactoryType().getInputItems().add(new Factory.FactoryType.Isp(1,Item.getInstance("Egg").getItemInfo()));
        Game game = new Game("Empty", mission1, farm1);
        Game.loadedGames.add(game);

        InputProcessor.GameNotSpecifiedMode();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();
            InputProcessor.process(string);
        }

    }


/*
    public static void main(String[] args) {
        ArrayList<Mission.Goal.EE> ees = new ArrayList<>(0);
        ees.add(new Mission.Goal.EE(Item.getInstance("Egg").getItemInfo(), 5));
        ees.add(new Mission.Goal.EE(Item.getInstance("Horn").getItemInfo(), 10));
        Mission mission1 = new Mission(new Mission.Goal(ees));
        Farm farm1 = new Farm();
        Game game = new Game("Empty", mission1, farm1);
        InputProcessor.game =game;



        //test 1
        */
/*InputProcessor.game.getFarm().getMap().getCellByPosition(new MapPosition(2,2)).addItem(WildAnimal.getInstance("Lion"));
        InputProcessor.game.getFarm().getMap().getCellByPosition(new MapPosition(2,2)).addItem(WildAnimal.getInstance("bear"));
        InputProcessor.game.getFarm().getMap().getCellByPosition(new MapPosition(2,2)).addItem(ProductiveAnimal.getInstance("Turkey"));
        //game.getFarm().
        game.getFarm().getMap().getCellByPosition(new MapPosition(2,2)).turn();

*//*








    }
*/




}

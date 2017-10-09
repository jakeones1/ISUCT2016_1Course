package DuckBehavior;

import DuckBehavior.Duck;
import DuckBehavior.FlyRocketPowered;
import DuckBehavior.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}

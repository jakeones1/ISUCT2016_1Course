/**
 * Created by Сергей on 11.01.2017.
 */
public class Lion {




     public void start(){
            System.out.println("Старт");
        }

        public void stop(){
            System.out.println("Стоп!");
        }

        public int drive(int howlong){
            int distance = howlong * 60;
             return distance;

        }
    public static void main(String[] args)
    {
        Lion Li = new Lion();
        int distance = Li.drive(40);
        System.out.println(distance);
    }

    }


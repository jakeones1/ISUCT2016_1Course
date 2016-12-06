/**
 * Created by stud_6 on 17.10.16.
 */
public class Computer extends Comput {

    private String brand;
    private String model;
    private int volume;
    @Override
    void breaking() {
        System.out.println("Polomka");
    }
    @Override
    void warming() {
        System.out.println("Nagrev");
    }
    @Override
    void aging() {
        System.out.println("Vosrast");
    }



   public void setBrand(String brand) {
       this.brand = brand;
   }
}











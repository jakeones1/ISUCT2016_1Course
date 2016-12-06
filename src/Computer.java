/**
 * Created by stud_6 on 17.10.16.
 */
public class Computer extends Comput {

    private String brand;
    private String model;
    private int volume;


    public Computer(){
        setBrand("NoBrand");
        setModel("200");
    }

    public Computer(String Bu, String Ka) {
        setBrand(Bu);
        setModel(Ka);
    }
    @Override
    public String toString(){
        return "Brand:"+this.getBrand()+"   Model:"+this.getModel();
    }

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

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}










package rockhomework3LV3;

public class Place implements sender{
    static String name,place;
    private Consumer ysh;
    public void setConsumer(Consumer ysh){
        this.ysh = ysh;
    }
    public void receivePackage(String name,String place){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Place.name = name;
        Place.place = place;
        sendInformation();
    }
    public void sendInformation(){
        Information I = new Information(name,place);
        ysh.getInformation(I);
    }
}

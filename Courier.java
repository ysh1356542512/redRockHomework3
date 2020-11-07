package rockhomework3LV3;

public class Courier implements JD{
    private Place p;
    public void setPlace(Place p){
        this.p = p;
    }
    public void preparePackage(String name,String place){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("快递小哥正在配送");
        p.receivePackage(name,place);
    }
//    public void sendPackage(String name,String place){
//        p.receivePackage(name,place);
//    }

}

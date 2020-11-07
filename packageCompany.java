package rockhomework3LV3;

public class packageCompany implements  JD{
    private Courier c;
    public void setCourier(Courier c){
        this.c = c;
    }
    public void preparePackage(String name,String place){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("您的快递已到黄角垭营业部 正在安排投递");
        c.preparePackage(name,place);
    }
//    public void sendPackage(String name,String place){
//        c.preparePackage(name,place);
//    }
}

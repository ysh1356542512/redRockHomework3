package rockhomework3LV3;

public class JDShop implements JD{
    private packageCompany p;
    public void setpackageCompany(packageCompany p){
        this.p = p;
    }
    public void preparePackage(String name,String place){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("商家已发货 正在运输");
        p.preparePackage(name,place);
    }
//    public void sendPackage(String name,String place){
//        p.preparePackage(name,place);
//    }
}

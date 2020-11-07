package rockhomework3LV3;

//设计了JD快递和ysh之间的接口回调 以及ysh和拿快递得人之间的接口回调
public class Ysh implements Consumer{
    String name,place;
    private JDShop j;
    public void setPJDShop(JDShop j){
        this.j = j;
    }
    public void xiadan(String name,String place){
        this.name = name;this.place = place;
        System.out.println("您购买的"+name+"已下单 等待商家发货");
        j.preparePackage(name,place);
    }
    public void getInformation(Information information){
        System.out.println("Ysh你的"+information.name+"到了,取件码为"+information.code+"请到"+information.place+"取件");
    }
    public void getPackage(Information information){
        System.out.println("ysh拿到了泷歌去拿的"+information.name);
    }
}

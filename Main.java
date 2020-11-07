package rockhomework3LV3;

public class Main {
    public static void main(String[] args) {
        Ysh ysh = new Ysh();
        Place p = new Place();
        Courier c = new Courier();
        packageCompany p1 = new packageCompany();
        JDShop j = new JDShop();
        p.setConsumer(ysh); c.setPlace(p); p1.setCourier(c); j.setpackageCompany(p1); ysh.setPJDShop(j);
        ysh.xiadan("电脑","学校");
        toolsMan longGe = new toolsMan();
        longGe.setConsumer(ysh);
        longGe.pickPackage();
    }
}

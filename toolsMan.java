package rockhomework3LV3;

public class toolsMan implements pickPackage{
    private Consumer ysh;
    public void  setConsumer(Consumer ysh){
        this.ysh = ysh;
    }
    public void pickPackage(){
        System.out.println("ysh让泷歌去拿快递");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Information information = new Information("电脑","学校");
        System.out.println("泷歌去"+information.place+"拿了ysh的"+information.name+"并准备回寝室");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ysh.getPackage(information);
    }
}

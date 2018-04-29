public class Sanji extends Person {
    public Sanji(String name1,String team1,String fruit1,int price1 ){
        super(name1,team1,fruit1,price1);
    }
    public void showAll(){
        System.out.println("角色名稱(Name):"+this.getName());
        System.out.println("海賊團(Team):"+this.getTeam());
        System.out.println("惡魔果實(Fruit):"+this.getFruit());
        System.out.println("懸賞金額(Price):"+this.getPrice());
    }
    public void showSkill(){
        System.out.println("惡魔風腳");
        System.out.println("月步");
        System.out.println("海步行");
    }

}

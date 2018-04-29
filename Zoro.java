public class Zoro extends Person{
    public Zoro (String name1, String team1, String fruit1, int price1){
        super(name1,team1,fruit1,price1);}
    public void showAll(){
        System.out.println("名稱:"+this.getName());
        System.out.println("海賊團:"+this.getTeam());
        System.out.println("惡魔果實:"+this.getFruit());
        System.out.println("懸賞金額:"+this.getPrice());
}
    public void showSkill(){
        System.out.println("大千世界");
        System.out.println("黑繩大龍捲");
        System.out.println("三百六十煩惱鳳");

    }
}

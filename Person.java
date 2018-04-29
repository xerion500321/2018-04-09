public class Person {
    private String name, team, fruit;
    private int price;

    public Person(String name1, String team1, String fruit1, int price1) {
        this.setName(name1);
        this.setTeam(team1);
        this.setFruit(fruit1);
        this.setPrice(price1);
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setTeam(String team1) {
        team = team1;
    }

    public void setFruit(String fruit1) {
        fruit = fruit1;
    }

    public void setPrice(int price1) {
        price = price1;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getFruit() {
        return fruit;
    }

    public int getPrice() {
        return price;
    }

    }

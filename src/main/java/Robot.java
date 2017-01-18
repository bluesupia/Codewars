/**
 * Created by supersupa on 2016. 12. 26..
 */
public class Robot {
    private String name;
    private int health;
    private int speed;
    private String[] tactics;
    
    public String[] getTactics() {
        return this.tactics;
    }
    
    public Robot setTactics(String[] tactics) {
        this.tactics = tactics;
        return this;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public Robot setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public Robot setHealth(int health) {
        this.health = health;
        return this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Robot setName(String name) {
        this.name = name;
        return this;
    }
}

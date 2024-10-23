
public class Dancer {
    private String name;
    private int age;
    private String danceStyle;
    protected boolean isDancing;

    public final void dance(){
        System.out.println(this.name + " is dancing " + this.danceStyle);
    }

    //region Constructors
    public Dancer(){}
    public Dancer(String name, int age, String danceStyle) {
        this.name = name;
        this.age = age;
        this.danceStyle = danceStyle;
    }
    //endregion

    //region Gets and sets
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public boolean isDancing() {
        return isDancing;
    }

    public void setDancing(boolean dancing) {
        isDancing = dancing;
    }
    //endregion










}

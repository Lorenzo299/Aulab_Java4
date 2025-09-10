public class Person {
    private String name;
    private String surnname;

    public Person(String name, String surnname) {
        this.name = name;
        this.surnname = surnname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnname() {
        return surnname;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

}

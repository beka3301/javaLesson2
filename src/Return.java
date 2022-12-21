public class Return {
    private String name;
    private int age;

    int Years() {
        int years = 65 - age;
        return years;

    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("ty vel pustoe ");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("net chisla");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("meny zavut: " + name + ",mne " + age + " let");
    }
}

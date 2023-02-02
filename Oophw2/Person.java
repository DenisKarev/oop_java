
class Person { // implements Human

    private String fName; // first name
    private String sName; // second name
    private String nName; // third name (отчество) or nick name?
    private String bDate; // birth date
    private String gender;

    public String FullName() {
        return String.format("%s %s (%s)", fName, sName, nName);
    }

    public Person(String name, String secondname, String nickname, String bithdate, String gender) {
        this.fName = name;
        this.sName = secondname;
        this.nName = nickname;
        this.bDate = bithdate;
        this.gender = gender;
    }

    public Person(String name, String secondname, String bithdate, String gender) {
        this.fName = name;
        this.sName = secondname;
        this.nName = "";
        this.bDate = bithdate;
        this.gender = gender;
    }

    public String toString() {
        return FullName();
    }

    public String fName() {
        return fName;
    }

    public String sName() {
        return sName;
    }

    public String nName() {
        return nName;
    }

    public String bDate() {
        return bDate;
    }

    public String gender() {
        return gender;
    }
}
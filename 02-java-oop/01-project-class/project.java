
public class project {
    private String Name;
    private String Description;

    public String elevatorPitch(String nm, String dc) {
        return nm + ": " + dc;
    }

    public String Project() {
        return " name is not set ";

    }

    public String Project(String Name) {

        this.Name = Name;
        return " the name of the project is: " + Name;

    }

    public String Project(String Name, String Description) {
        this.Name = Name;
        this.Description = Description;
        return " the name and description is: " + Name + " : " + Description;

    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

}

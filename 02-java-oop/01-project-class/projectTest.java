
public class projectTest {

    public static void main(String[] args) {
        project pj = new project();

        System.out.println(pj.elevatorPitch("Project1", " one of the first projects done"));
        System.out.println(pj.Project());
        System.out.println(pj.Project("project 2"));
        System.out.println(pj.Project("project3", "this is a description for the project"));

        String pjName = pj.getName();
        String pjDesc = pj.getDescription();

        System.out.println(" The last project was: " + pjName + " : " + pjDesc);
    }
}

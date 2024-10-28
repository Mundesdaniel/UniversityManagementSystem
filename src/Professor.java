//Design the Professor class. • The attributes are an ID, a first name,
// a last name, and the name of the course taught by the professor.
// • Write a constructor for this class that takes all the attributes
// and another constructor without the course taught,
// along with getters and setters for all attributes.
// • The class will also have the following method:
// ▪ assignGrade(Student s, int grade),
// which adds the grade to the student s grades list if the grade is greater
// than or equal to 18; otherwise, it prints a message to inform the student that
// they have failed.

public class Professor {
    private int id;
    private String firstName;
    private String lastName;
    private String courseTaught;



    public Professor (int id, String firstName, String lastName, String courseTaught){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseTaught = courseTaught;
    }
    public Professor (int id, String firstName, String lastName){
        this(id, firstName, lastName, null);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

    public static void assignGrade(Student s, double grade){
        if (grade >= 18){
            s.getGrades().add( grade);

        }else {
            System.out.println("you can not add another");
        }
        }

    }



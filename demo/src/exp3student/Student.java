package exp3student;

public class Student {
	private String id;
    private String grade;
    private String name;

    public Student(String id, String name, String grade) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    public String return_id() {
        return id;
    }

    public String return_information() {
        return "ѧ�ţ�"+id+"\t\t�꼶��"+grade+"\t\t������"+name;
    }
}

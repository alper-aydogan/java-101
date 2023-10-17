public class courses {
    //Nitelikler : name,code,prefix,note,Teacher
    //Metotlar : Course() , addTeacher() , printTeacher()
    String name;
    String code;
    String prefix;
    int note;
    teacher teacher;
    int quiz;

    //kurucu metot
    courses(String name, String code, String prefix, int note,int quiz) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.quiz=quiz;
    }

    void addTeacher(teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("öğretmen ve ders uyuşmuyor");
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

}

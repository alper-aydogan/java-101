public class students {
    //Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    //Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
    courses c1;
    courses c2;
    courses c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    students(String name, String stuNo, String classes, courses c1, courses c2, courses c3) {
        this.name = name;
        this.avarage = 0.0;
        this.isPass = false;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
    }

    void addBulkQuizNote(int quiz1, int quiz2, int quiz3) {
        if (quiz1 >= 0 && quiz1 <= 100) {
            this.c1.quiz = quiz1;
        }
        if (quiz2 >= 0 && quiz2 <= 100) {
            this.c2.quiz = quiz2;
        }
        if (quiz3 >= 0 && quiz3 <= 100) {
            this.c3.quiz = quiz3;
        }
    }

    void isPass() {
        this.avarage = ((this.c1.note * 0.8 + this.c1.quiz * 0.2)+(this.c2.note * 0.8 + this.c2.quiz * 0.2)+ (this.c3.note * 0.8 + this.c3.quiz *0.2)/3.0);
        if (avarage < 55) {
            System.out.println("dersten kaldınız");
        } else {
            System.out.println("dersten geçtiniz");
        }
        printNOte();
    }

    void printNOte() {
        System.out.println(this.c1.name  + " notu:" + this.c1.note);
        System.out.println(this.c2.name + " notu:" + this.c2.note);
        System.out.println(this.c3.name + " notu:" + this.c3.note);
        System.out.println(this.c1.name+" quiz notu"+this.c1.quiz);
        System.out.println(this.c2.name+" quiz notu:"+this.c2.quiz);
        System.out.println(this.c3.name+" quiz notu:"+this.c3.quiz);
    }
}





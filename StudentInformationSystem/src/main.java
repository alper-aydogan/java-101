public class main {
    public static void main(String[] args) {
        teacher t1 = new teacher("Ali", "505", "FZK");
        teacher t2 = new teacher("ahmeet", "999", "BIO");

        courses c1 = new courses("fizik", "101", "FZK", 88, 78);
        courses c2 = new courses("MAT", "102", "MAT", 78, 90);
        courses c3 = new courses("BIO", "102", "BIO", 90, 96);

        students s1 = new students("ayse", "112", "11", c1, c2, c3);
        s1.addBulkQuizNote(100, 31, 23);
        s1.addBulkExamNote(75, 45, 88);
        s1.isPass();
    }

}

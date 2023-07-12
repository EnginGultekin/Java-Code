public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physic;
    Course chemical;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physic,Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physic = physic;
        this.chemical = chemical;
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physic, int chemical) {

        if (math >= 0 && math <= 100) this.math.note = math;

        if (physic >= 0 && physic <= 100)  this.physic.note = physic;

        if (chemical >= 0 && chemical <= 100) this.chemical.note = chemical;
    }

    public void addBulkOralNote(int math, int physic, int chemical) {

        if (math >= 0 && math <= 100) this.math.verbalNote = math;

        if (physic >= 0 && physic <= 100)  this.physic.verbalNote = physic;

        if (chemical >= 0 && chemical <= 100) this.chemical.verbalNote = chemical;
    }

    public void isPass() {
        if (this.math.note == 0 || this.physic.note == 0 || this.chemical.note == 0) {
            System.out.println("Notes not fully entered");
        } else if (this.math.verbalNote == 0 || this.physic.verbalNote == 0 || this.chemical.verbalNote == 0) {
            System.out.println("Verbal Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Total Average : " + Math.round(this.average));
            if (this.isPass) {
                System.out.println("Lesson Passed :) ");
            } else {
                System.out.println("Lesson Failed :( ");
            }
        }
    }

    public double lesAvr(Course allNote){
        return  (allNote.note * 0.80) + (allNote.verbalNote * 0.20);
    }

    public void calcAverage() {
        this.average =  (lesAvr(this.physic) + lesAvr(this.chemical) + lesAvr(this.math)) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematical Average : " + lesAvr(this.math));
        System.out.println("Physical Average : " + lesAvr(this.physic));
        System.out.println("Chemical Average : " + lesAvr(this.chemical));
    }

}
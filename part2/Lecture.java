package part2;

public class Lecture implements Cloneable {
    String lecturer;
    String name;

    public Lecture(){}

    public Lecture(String lecturer, String name) {
        this.lecturer = lecturer;
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showLectureInfo(){
        System.out.printf("강의명: %s | 강사명: %s\n", name, lecturer);
    }

    @Override
    public Lecture clone() {
        Lecture lecture = null;
        try {
            lecture = (Lecture) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return lecture;
    }
}

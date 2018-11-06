package lesson7;

public class Pupil {
    private  int id;
    private String [] examResults;

    public void setExams(String[] nameSubject, int[] mark){
        if(nameSubject.length == mark.length) {
            examResults = new String[nameSubject.length];
            ExamResult status = new ExamResult ();
            for (int i = 0; i < 2; i++) {
                StringBuilder str = new StringBuilder ();
                examResults[i] =
                        str.append (nameSubject[i]).append (status.getStatus (mark[i])).append("\n").toString ();
            }
        }else{
            System.out.println ("Ошибочное число данных");
        }
    }

    public Pupil(int id) {
        this.id = id;
    }

    public Pupil(int id, String[] examResults) {
        this.id = id;
        this.examResults = examResults;
    }

    public String[] getExamResults() {
        return examResults;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String value : examResults) {
            builder.append(value);
        }
        String text = builder.toString();
        return "Студент: " + id + "\n" + text;
    }

    class ExamResult{
        String nameSubject;
        int mark;
        boolean status;

        String getStatus(int mark){
            if (mark > 2){
                return " сдал";
            }else{
                return " не сдал";
            }
        }
    }
}

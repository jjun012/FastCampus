public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m=new Movie[3];
        m[0]=new Movie();
        m[0].name="김민준";
        m[0].grade=12;
        m[0].time=120;
        m[0].man="준";
        m[0].date="20391";
        m[1]=new Movie();
        m[1].name="조동현";
        m[1].grade=12;
        m[1].time=120;
        m[1].man="준";
        m[1].date="20391";
        m[2]=new Movie();
        m[2].name="박지윤";
        m[2].grade=12;
        m[2].time=120;
        m[2].man="준";
        m[2].date="20391";
        for(int i=0;i<m.length;i++){
            System.out.println(m[i].name+"\t"+m[i].grade+"\t"+m[i].time+"\t"+m[i].man+"\t"+m[i].date);
        }
    }
}

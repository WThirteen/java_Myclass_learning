public class Myclass {
    int grade;
    String specialized;
    int class_n;
    String Monitor;
    public void Class_information(){
        System.out.printf("年纪：%d\n",grade);
        System.out.printf("专业：%s\n",specialized);
        System.out.printf("班级序号：%d\n",class_n);
    }
    public void Get_Monitor(){
        System.out.printf("班级负责人：%s\n",Monitor);
    }
    public void set_Monitor(String name){
        this.Monitor=name;
    }
    public Myclass(){

    }
    public Myclass(int grade,String specialized,int class_n){
        this.grade=grade;
        this.specialized=specialized;
        this.class_n=class_n;
    }
}

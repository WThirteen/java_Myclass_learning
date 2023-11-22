public class Myclass_test {
    public static void main(String[] args){
        Myclass m1;
        m1 = new Myclass();
        m1.grade=21;
        m1.class_n=2;
        m1.specialized="人工智能";
        m1.Class_information();
        m1.set_Monitor("王五");
        m1.Get_Monitor();

        Myclass m2;
        m2=new Myclass(21,"人工智能",1);
        m2.Class_information();
        m2.set_Monitor("魏二");
        m2.Get_Monitor();
    }
}

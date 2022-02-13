package temp0207;

import java.util.Vector;

class MyData2{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyData2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public MyData2(){
        name = "";
        age = 0;
    }
}

public class Test1641 {
    public static void main(String[] args){
        Vector<MyData2> v = new Vector<MyData2>();

        /*
        MyData2 st1 = new MyData2();
        st1.setName("aa");
        st1.setAge(12);
        MyData2 st2 = new MyData2();
        st2.setName("bb");
        st2.setAge(3);
        MyData2 st3 = new MyData2();
        st3.setName("cc");
        st3.setAge(43);
         */

    }
}

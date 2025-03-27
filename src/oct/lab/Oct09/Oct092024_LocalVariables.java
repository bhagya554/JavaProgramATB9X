package oct.lab.Oct09;

public class Oct092024_LocalVariables {
    public static void main(String[] args) {
        int age=50;
        {
            String name="Sachin";
        }
        //System.out.println(name);--->not possible
    }
    public void getAge(){
        //System.out.println(age); ---> not possible
    }
}

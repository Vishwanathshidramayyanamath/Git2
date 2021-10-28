class Demo1{
    int test()
    {
        System.out.println("Running test funtion");
        return 8;
    }
    float disp()
    {
        System.out.println("Running test funtion");
        return 3.4;
    }
}
    // =================================================
    class Demo2{
        int test()
        {
            System.out.println("Running test funtion");
            return 2;
        }
        float disp()
        {
            System.out.println("Running test funtion");
            return 3.3;
        }
    
}
class MainClass33
{
    public static void main(String[] args) {
       Demo1 d1=new Demo1();
       Demo1 d2=new Demo1();
        System.out.println("value of test is"+d1.test());
        System.out.println("value of test is"+d2.disp());
        Demo2 d3=new Demo2();
        Demo2 d4=new Demo2();
        System.out.println("value of test is"+d3.test());
        System.out.println("value of test is"+d4.disp());
    }
}
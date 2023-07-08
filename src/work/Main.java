package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts....");

//        MyInterface myInterface=new MyInterImpl();
//        myInterface.sayHello();
//
//        MyInterface i1=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is first anonymous class");
//            }
//        };
//
//        i1.sayHello();
//
//        MyInterface i2=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is second anonymous class");
//            }
//        };
//
//        i2.sayHello();

         MyInterface i=()-> System.out.println("first time using lambda");
         i.sayHello();

         MyInterface i1=()-> System.out.println("second time i  am using lambda");
         i1.sayHello();


         SumInterFace sumInterFace=(a,b)->a+b;
        System.out.println(sumInterFace.sum(4,6));

        StringInterface stringInterface=(string -> string.length());

        System.out.println(stringInterface.getLength("Bishwa mohan Pati"));
    }
}
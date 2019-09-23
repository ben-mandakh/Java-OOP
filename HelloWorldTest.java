public class HelloWorldTest{
    public static void main(String[] args){
        HelloWorld p = new HelloWorld();
        String greeting = p.greet();
        String greetingWithName = p.greet("Ben");
        if(greeting.equals("Hello World!") || greetingWithName.equals("Hello Ben")){
            System.out.println("Test successful");
        }else{
            System.out.println("Test Fail!");
        }
    }
}
public class HelloWorld {
    /*
    this is a multi line comment
    in java (non-web) applications, there must be atleast
    one main method in order to start the application thread
    */
    public static void main(String[] args) {
        // takes in a string as a parameter and spits it out to the CMD line
        System.out.println("Hello world!");
        System.out.println(add(1,2,3,4,5,6,7,8,9));
    }

    // method overloading
    static int add(int x) {
        return x;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int... nums) {
        int sum = 0;
        for(int x : nums) {
            sum += x;
        }
        return sum;
    }
}
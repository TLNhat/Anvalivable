
    class OverloadDemo {
        void test() {
            System.out.println("No parameters");
        }

        void test(int a) {
            System.out.println("a: " + a);
        }

        double test(double a) {
            System.out.println("a: " + a);
            return a * a;
        }
    }

    public class Main {
        public static void main(String[] args){
            OverloadDemo ob = new OverloadDemo();
            double result;

            ob.test();
            ob.test(10);
            ob.test(4.3);
            result = ob.test(10.5);
            System.out.println("Result of ob: " + result);

    }
}



package stepic;

public class MethodCall {
    public static void main(String[] args) {
        test();
    }

    public static void method1() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length < 4)
            return null;

        return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName(); // your implementation here
    }

    public static void test() {
        try {
            int x = 1;
            if (x == 1)
                return;
            System.out.println("after return");
        }catch (Exception ignored) {

        } finally {
            System.out.println("finally");
        }
    }
}

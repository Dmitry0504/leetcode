package stepic;

public class MethodCall {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        method1();
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
}

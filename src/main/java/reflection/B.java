package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class B {

    public static void main(String[] args) {
        A a;
        try {
            Class<?> clazz = Class.forName(A.class.getName());
            a = (A) clazz.getConstructor().newInstance();

            Method method = A.class.getDeclaredMethod("printText", String.class);
            method.setAccessible(true);
            method.invoke(a, "Hello");
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

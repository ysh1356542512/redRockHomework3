package rockhomework3LV4;

import java.lang.reflect.Field;

public class fanshe {
    public void setProperty(Object obj, String x,String value) throws NoSuchFieldException, IllegalAccessException {
        Class c = obj.getClass();
        Field f = c.getDeclaredField(x);
        f.setAccessible(true);
        if(f.getGenericType().toString().equals("int")) {
            try {
                int d = Integer.parseInt(value);
                f.set(obj, d);
            } catch (NumberFormatException e) {
            }
        }
    }
}
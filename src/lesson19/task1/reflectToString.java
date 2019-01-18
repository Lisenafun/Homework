package lesson19.task1;

import lesson18.alarmObserver.Sensor;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class reflectToString {

    public static String toString(Object o){
        if(o == null)
            return "null";
    Class <?> aClass = o.getClass ();
    String simpleNameClass = aClass.getSimpleName ();
    StringBuilder inConsole = new StringBuilder ();
    inConsole.append ("").append (" Class: ").append (simpleNameClass);
    if(aClass.isPrimitive ()||aClass.equals(String.class)||aClass.equals(Integer.class)
                ||aClass.equals(Long.class)||aClass.equals(Byte.class)||aClass.equals(Boolean.class)
                ||aClass.equals(Short.class)||aClass.equals(Float.class)||aClass.equals(Double.class)
                ||aClass.equals(Character.class)){
        inConsole.append ("\t").append ("Value: ").append (String.valueOf (o)).append ("\n");
    } else if(aClass.isArray ()){
        inConsole.append (" is array: ").append ("{ ");
//        String r = aClass.getComponentType() + "[]{";
        for (int i = 0; i < Array.getLength (o); i++) {
//            if(i>0)inConsole.append (r).append (", ");
            Object val = Array.get(o, i);
            if (aClass.getComponentType().isPrimitive()||aClass.equals(String.class)||aClass.equals(Integer.class)
                    ||aClass.equals(Long.class)||aClass.equals(Byte.class)||aClass.equals(Boolean.class)
                    ||aClass.equals(Short.class)||aClass.equals(Float.class)||aClass.equals(Double.class)
                    ||aClass.equals(Character.class)) inConsole.append ("component of array ").append (i + " ").append (val);
            else inConsole.append ("component of array ").append (i + " ").append (toString (val));
        }
        inConsole.append (" }\n");
    } else {
        Field[] declaredFields = aClass.getDeclaredFields ();
        String[] nameField = new String[declaredFields.length];
        Object[] objFields = new Object[declaredFields.length];
        Class<?>[] typeClass = new Class[declaredFields.length];
        inConsole.append ("\n").append (" Fields:").append ("\n");

        for (int i = 0; i < declaredFields.length; i++) {
            if(!declaredFields[i].isAnnotationPresent(Exclude.class)) {
                declaredFields[i].setAccessible (true);
                nameField[i] = declaredFields[i].getName ();
                typeClass[i] = declaredFields[i].getType ();
                try {
                    objFields[i] = declaredFields[i].get (o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace ();
                }
                inConsole.append (" ").append ("Name of fields: ").append (nameField[i]).append ("; ").
                        append ("type of class: ").append (typeClass[i]).append ("; ").append ("object of class: ").append (toString (objFields[i])).append ("");
            }
        }
    }
    return inConsole.toString ();
}
    public static void main(String[] args) throws IllegalAccessException {
//        int count = 4;
//        System.out.println (toString (count));
        Sensor sensor = new Sensor ();
        System.out.println (toString (sensor));

    }
}

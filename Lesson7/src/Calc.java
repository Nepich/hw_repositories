public class Calc {
    
    public static <T> void summ (T first, T second){
        try{
            System.out.println((int)first + (int)second);
        } catch (ClassCastException e) {
            int a = Integer.parseInt((String) first);
            int b = Integer.parseInt((String) second);
            System.out.println(a + b);
        }
}


    public static <T> void subtr (T first, T second){
        try{
            System.out.println((int)first - (int)second);
        } catch (ClassCastException e) {
            int a = Integer.parseInt((String) first);
            int b = Integer.parseInt((String) second);
            System.out.println(a - b);
        }
    }

    public static <T> void mult (T first, T second){
        try{
            System.out.println((int)first * (int)second);
        } catch (ClassCastException e) {
            int a = Integer.parseInt((String) first);
            int b = Integer.parseInt((String) second);
            System.out.println(a * b);
        }
    }

    public static <T> void divis (T first, T second){
        try {
            System.out.println((Integer) first / (Integer)second);
        } catch (ArithmeticException e){
            System.out.println("Ало! На ноль делишь");
        } catch (ClassCastException e) {
            int a = Integer.parseInt((String) first);
            int b = Integer.parseInt((String) second);
            try {System.out.println(a / b);
            } catch (ArithmeticException f){
                System.out.println("Ало! На ноль делишь");
        }
    }
}
}

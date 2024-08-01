public class primitives2 {
    public static void main(String[] args) {

        byte myMinByteValue = -128;
//        byte myMinByteValue = -128 / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        int myNewInt = myMinByteValue;

        float myFloatValue = 23.234F;
        float myFloatValue2 = 2.4e-3F;
        System.out.println(myFloatValue);
        System.out.println(myFloatValue2);

        double myDoubleValue = -78.787865765413;
        double myDoubleValue2 = 1.8e14;

        System.out.println(myDoubleValue);
        System.out.println(myDoubleValue2);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        double answer = 3.0 / 2.0;
        System.out.println(answer);

        System.out.println(0.1 + 0.1 + 0.1);



    }
}

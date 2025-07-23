package Vladik_1;

import java.lang.Double;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if( obj instanceof ComplexNumber){
            ComplexNumber complexNumber = (ComplexNumber)obj;
            return re == complexNumber.re && (im == complexNumber.im);
        }
        else return false;
    }

    @Override
    public int hashCode(){
        Double a = getRe();
        Double b = getIm();
        int result  = a.hashCode();
        result = 31*result+(b!=null?b.hashCode():0);
        return result;
    }
}
class Test{
    public static void main(String[] args) {
        ComplexNumber a1 = new ComplexNumber(5,4);
        ComplexNumber a2 = new ComplexNumber(5,4);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}











































    /*public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k<result.length;k++){
            if (i > a1.length-1) {
                int a = a2[j];
                result[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                result[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                result[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                result[k] = b;
                j++;
            }
        }
        return result;
    }
}
*/





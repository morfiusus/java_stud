package Mdk;

public class Motor extends Metods {
    public int n1; //об/мин
    public double Ph; //кВт
    public double Nh; //%
    public double cosf;
    public double Sh; //%
    public double Ih;

    public Motor(int n1, double Ph, double Nh, double cosf, double Sh, double Ih) {
        this.cosf = cosf;
        this.Ih = Ih;
        this.Ph = Ph;
        this.Nh = Nh;
        this.n1 = n1;
        this.Sh = Sh;
        System.out.println(nominalTokElektropriem(Ih, Ph, cosf, Nh));
        Ih = nominalTokElektropriem(Ih, Ph, cosf, Nh);
        System.out.println(puskTok(Ih));
        System.out.println(teploRascepTok(Ih));
        System.out.println(elektromagRascepTok(Ih));
        maxMin(Ih);
    }
}

class Metods {
    static double nominalTokElektropriem(double Ih, double Ph, double cosf, double Nh) {
        Nh /= 100;
        Ih = (Ph * 1000) / (1.73 * 380 * cosf * Nh);
        return Ih;
    }

    static double puskTok(double Ih) {
        double Kpusk = 0.71;
        double Ipusk = Kpusk * Ih;
        return Ipusk;
    }

    static double teploRascepTok(double Ih) {
        double Itr = 1.15 * Ih;
        return Itr;
    }

    static double elektromagRascepTok(double Ih) {
        double Iem = 1.25 * Ih;
        return Iem;
    }

    static double plavVstavTok(double Ipusk) {
        double Iplvs = Ipusk / 0.64;
        return Iplvs;
    }

    static void maxMin(double Ih) {
        double Imax = Ih / 1.6;
        double Imin = Ih / 2.5;
        System.out.println("Imax = " + Imax + " Imin = " + Imin);
    }
}

class Rasschet {
    public static void main(String[] args) {
        Motor m6 = new Motor(1500, 55, 93, 0.89, 2, 7);
        Motor m9 = new Motor(1000, 7.5, 85.5, 0.81, 4, 7);
        Motor m10 = new Motor(1000, 11, 88, 0.83, 4, 7);
    }
}

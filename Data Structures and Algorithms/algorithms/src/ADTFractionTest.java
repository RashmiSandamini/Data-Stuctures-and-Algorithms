public class ADTFractionTest {
    public static void main(String[] args) {
        ADTFraction a1 = new ADTFraction(2, 3);
        ADTFraction a2 = new ADTFraction(20, 100);
//        ADTFraction a3 = a1.times(a2);
        a2.refine();
        a2.display();

    }
}

class ADTFraction {
    private int n; //numerator
    private int d; //denomenator

    //---------------------------------------------------
    public ADTFraction() {//default constructor
        this.n = 0;
        this.d = 1;
    }

    //---------------------------------------------------
    public ADTFraction(int a, int b) {//parameter constructor
        if (b != 0) {
            this.n = a;
            this.d = b;
        } else {
            this.n = 0;
            this.d = 1;
            System.out.println("Denominator cannot be zero.Default values assigned");
        }

    }

    //---------------------------------------------------
    public void set(int a, int b) {//set numerator and denomenator
        if (b != 0) {
            this.n = a;
            this.d = b;
        } else {
            System.out.println("Denominator cannot be zero.Assigning values terminated");
        }
    }

    public ADTFraction plus(ADTFraction x) {//add two fractions
        int num, den;
        num = this.n * x.d + x.n * this.d;
        den = this.d * x.d;
//        return new ADTFraction(this.n * x.d + x.n * this.d,this.d * x.d); alternative
        return new ADTFraction(num, den);
    }

    public ADTFraction times(int a) {//multiply fraction by a number
        return new ADTFraction(this.n * a, this.d);
    }

    public ADTFraction times(ADTFraction x) {//multiply two fractions
        return new ADTFraction(this.n * x.n, this.d * x.d);
    }

    public ADTFraction reciprocal() {//reciprocal of a fraction
        return new ADTFraction(this.d, this.n);
    }

    public float value() {//numerical value of a fraction
        return (float) this.n / this.d;
    }

    public void display() {//display the fraction in the format n/d
        System.out.println("Fraction: " + this.n + " / " + this.d);
    }

    public void refine() {//set the instance to its minimum fraction
        int min = Math.min(this.n, this.d);
        while (min != 1) {
            if (this.n % min == 0 && this.d % min == 0) {
                this.n = this.n / min;
                this.d = this.d / min;
            } else {
                min--;
            }
        }
    }
}

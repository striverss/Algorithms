package com.leyao.chapter.chapter1_2;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Rational {
    private final int numerator;
    private final int denominator;
    private final int MAX = Integer.MAX_VALUE;
    private final int MIN = Integer.MIN_VALUE;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("分母不能为0!");
        }
        assert isOverFlow(numerator) : "分子值超出使用范围";
        assert isOverFlow(denominator) : "分母值超出使用范围";
        //当分母为负数时，要对分子分母同时求相反数才会使得结果正确
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        //求分子分母最大公约数
        int greatestCommonDivisor = gcd(numerator, denominator);
        //保证分子分母互质，没有公约数
        this.numerator = numerator / greatestCommonDivisor;
        this.denominator = denominator / greatestCommonDivisor;
    }

    private int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public Rational plus(Rational b) {
        assert isPlusOverFlow(this.numerator * b.denominator, this.denominator * b.numerator) : "plus overflow.";
        assert isTimesOverFlow(this.denominator, b.denominator) : "times overflow.";
        return new Rational(this.numerator * b.denominator + this.denominator * b.numerator, this.denominator * b.denominator);
    }

    public Rational minus(Rational b) {
        assert isMinusOverFlow(this.numerator * b.denominator, this.denominator * b.numerator) : "minus overflow.";
        assert isTimesOverFlow(this.denominator, b.denominator) : "times overflow.";
        return new Rational(this.numerator * b.denominator - this.denominator * b.numerator, this.denominator * b.denominator);
    }

    public Rational times(Rational b) {
        assert isTimesOverFlow(this.numerator, b.numerator) : "times overflow.";
        assert isTimesOverFlow(this.denominator, b.denominator) : "times overflow.";
        return new Rational(this.numerator * b.numerator, this.denominator * b.denominator);
    }

    public Rational divides(Rational b) {
        assert isTimesOverFlow(this.numerator, b.denominator) : "times overflow.";
        assert isTimesOverFlow(this.denominator, b.numerator) : "times overflow.";
        return new Rational(this.numerator * b.denominator, this.denominator * b.numerator);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Rational that = (Rational) object;
        if (this.numerator != that.numerator) {
            return false;
        }
        if (this.denominator != that.denominator) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "numerator: " + numerator + ", denominator: " + denominator;
    }

    private boolean isOverFlow(int a) {
        if (a > MAX) return false;
        if (a < MIN) return false;
        return true;
    }

    private boolean isPlusOverFlow(int a, int b) {
        if (a + b > MAX || a + b < MIN) {
            return false;
        }
        return true;
    }

    private boolean isMinusOverFlow(int a, int b) {
        if (a - b > MAX || a - b < MIN) {
            return false;
        }
        return true;
    }

    private boolean isTimesOverFlow(int a, int b) {
        if (a * b > MAX || a * b < MIN) {
            return false;
        }
        return true;
    }
}


/**
 * A class representing complex numbers and their operations.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Constructor to create a complex number with given real and imaginary parts.
     *
     * @param real      The real part of the complex number.
     * @param imaginary The imaginary part of the complex number.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Adds another complex number to this complex number.
     *
     * @param other The complex number to add.
     * @return The result of the addition as a new ComplexNumber object.
     */
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    /**
     * Multiplies this complex number with another complex number.
     *
     * @param other The complex number to multiply with.
     * @return The result of the multiplication as a new ComplexNumber object.
     */
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * Divides this complex number by another complex number.
     *
     * @param other The complex number to divide by.
     * @return The result of the division as a new ComplexNumber object.
     * @throws ArithmeticException If the other complex number is zero.
     */
    public ComplexNumber divide(ComplexNumber other) throws ArithmeticException {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * Get the real part of the complex number.
     *
     * @return The real part.
     */
    public double getReal() {
        return real;
    }

    /**
     * Get the imaginary part of the complex number.
     *
     * @return The imaginary part.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * String representation of the complex number in the form "a + bi".
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, Math.abs(imaginary));
        }
    }
}


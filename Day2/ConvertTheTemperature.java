public class ConvertTheTemperature {
// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00

// Input: celsius = 36.50
// Output: [309.65000,97.70000]
public static double[] convertTemperature(double celsius) {
    double arr[] = new double[2];
    double k = celsius+273.15;
    double f = celsius *1.80+32.00;
    
    arr[0] = k;
    arr[1] = f;
    return arr;
}
public static void main(String[] args) {
    double cel = 36.50;
    System.out.println(convertTemperature(cel));

    
}
}

public class FinancialForecast {
    public static double futureValue(double pv, double rate, int periods) {

        if (periods == 0) {
            return pv;
        }

        return (1 + rate) * futureValue(pv, rate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; 
        int years = 10;

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, result);
    }
}

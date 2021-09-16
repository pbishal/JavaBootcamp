package Com.BridgeLabz.BooaterBootCampPrograms.day4;
import Com.BridgeLabz.BooaterBootCampPrograms.day1.Utility;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
        double temperatureInFerenheit, temperatureInCelcius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Temperature in Ferenheit : ");
        temperatureInFerenheit = scanner.nextDouble();
        temperatureInCelcius = utility.FahrenheitToCelsius(temperatureInFerenheit);
        System.out.println("Fahrenheit to Celcius of " + temperatureInFerenheit + " is " + temperatureInCelcius);

        System.out.println("Enter Temperature in Celsius : ");
        temperatureInCelcius = scanner.nextDouble();
        temperatureInFerenheit = utility.CelsiusToFahrenheit(temperatureInCelcius);
        System.out.println("Celcius to Fahrenheit of " + temperatureInCelcius + " is " + temperatureInFerenheit);

        scanner.close();

	}

}

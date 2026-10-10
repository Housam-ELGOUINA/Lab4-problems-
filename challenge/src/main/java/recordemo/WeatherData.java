package recordemo;
//
public record WeatherData(double temperatureCelsius, String conditions) {
//
  // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return  this.temperatureCelsius*(9)/5 + 32 ;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format(" Current weather  : " + this.temperatureCelsius + "°C ( "
                + temperatureFahrenheit() + "°F ) " + " and " + this.conditions) ;





    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {

        double C = (tempFahrenheit- 32)*5/9 ;
       //
        WeatherData w  = new WeatherData(C, conditions)  ;
        return w ;
    }

    public static void main(String[] args) {

        WeatherData weather1  =  new WeatherData(25 , "Sunny") ;

        WeatherData w  = WeatherData.fromFahrenheit(77 ,"cloudy");

        System.out.println("Today's weather : "+ weather1.getSummary());

        System.out.println("Yesterday 's weather  : " + w.getSummary());


    }
}

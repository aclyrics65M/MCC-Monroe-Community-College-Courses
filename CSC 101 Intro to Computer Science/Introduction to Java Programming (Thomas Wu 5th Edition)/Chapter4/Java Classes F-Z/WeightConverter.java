// MoonWeight Converter class

public class WeightConverter {

   // Data Members
   //private double moonWeight;
   //private double earthWeight;
   private double conversionWeight;
   
   // Blank Constructor
   public WeightConverter() {
      // Blank
   }
   
   // Constructor
   public WeightConverter(double weight) {
      this.conversionWeight = weight;
   }
   
   
   public double getWeight(){
      return conversionWeight;
   }
   
   public void setWeight(double number) {
      conversionWeight = number;
   }
   
   
   // Modifier
   public double convert(double planetConversion) {
      return planetConversion * conversionWeight;  
   }
   
   // Accessors
   /*
   public double getEarthWeight() {
      return earthWeight;
   }
   */
   
   /*
   public double getMoonWeight() {
      return moonWeight;
   }
   */


}
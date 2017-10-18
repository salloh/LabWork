public class X {
 public void displayData(String ... values){
  System.out.println("Number of arguments passed " + values.length);
  for(String s : values){
   System.out.println(s + " ");
  }
 }

}
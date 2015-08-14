<<<<<<< HEAD
=======
import java.io.Console;
>>>>>>> f8994cd808cf4d3f893434ab2134b307e5b83b71
import java.util.Arrays;
import java.util.List;
import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
<<<<<<< HEAD
import java.io.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class NumbersToWords {
    public static void main(String[] args) {

      String layout = "templates/layout.vtl";
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/home.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/numberstowords", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/numberstowords.vtl");


            String numberAsString = request.queryParams("getnumber");
            Integer number = Integer.parseInt(numberAsString);
            String finalWord = finalWord(number);

            model.put("finalWord",finalWord);


            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());


    }


    public static String finalWord(Integer number) {


        HashMap<Integer, String> inwords = new HashMap<Integer, String>();

        inwords.put(1,"one");
        inwords.put(2,"two");
        inwords.put(3,"three");
        inwords.put(4,"four");
        inwords.put(5,"five");
        inwords.put(6,"six");
        inwords.put(7,"seven");
        inwords.put(8,"eight");
        inwords.put(9,"nine");
        inwords.put(10,"ten");
        inwords.put(11,"eleven");
        inwords.put(12,"twelve");
        inwords.put(13,"thirteen");
        inwords.put(14,"fourteen");
        inwords.put(15,"fifteen");
        inwords.put(16,"sixteen");
        inwords.put(17,"seventeen");
        inwords.put(18,"eighteen");
        inwords.put(19,"nineteen");

        HashMap<Integer, String> tens = new HashMap<Integer, String>();
        tens.put(1,"ten");
        tens.put(2,"twenty");
        tens.put(3,"thirty");
        tens.put(4,"forty");
        tens.put(5,"fifty");
        tens.put(6,"sixty");
        tens.put(7,"seventy");
        tens.put(8,"eighty");
        tens.put(9,"ninety");

        // convert received integer (number) into String
        String numberAsString = Integer.toString(number);

        // convert the number into an Array
        char[] numberChar = numberAsString.toCharArray();

        // variable to store the length of the char Array
        Integer arrayLength = numberChar.length;


        // between 11 and 19
        if (arrayLength == 2 && numberChar[0] == '1'){
          return inwords.get(number);
        }

        // round tens (20, 30, 40...)
        else if (arrayLength == 2 && numberChar[1] == '0'){
          String firstNumberStr = Character.toString(numberChar[0]);
          Integer firstNumber = Integer.parseInt(firstNumberStr);
          return tens.get(firstNumber);
        }

        // twenty-something or thirty-something...
        else if (arrayLength == 2 && numberChar[1] != '0' && numberChar[0] != '1'){
          String firstNumberStr = Character.toString(numberChar[0]);
          Integer firstNumber = Integer.parseInt(firstNumberStr);
          String secondNumberStr = Character.toString(numberChar[1]);
          Integer secondNumber = Integer.parseInt(secondNumberStr);

          return tens.get(firstNumber) + "-" + inwords.get(secondNumber);
        }

        // round hundreds
        else if (arrayLength == 3 && numberChar[1] == '0' && numberChar[2] == '0'){
          String firstNumberStr = Character.toString(numberChar[0]);
          Integer firstNumber = Integer.parseInt(firstNumberStr);

          return inwords.get(firstNumber) + " hundred";
        }

        // for 120, 230, 440...
        else if (arrayLength == 3 && numberChar[1] != '0' && numberChar[2] == '0'){
          String firstNumberStr = Character.toString(numberChar[0]);
          Integer firstNumber = Integer.parseInt(firstNumberStr);
          String secondNumberStr = Character.toString(numberChar[1]);
          Integer secondNumber = Integer.parseInt(secondNumberStr);

          return inwords.get(firstNumber) + " hundred " + tens.get(secondNumber);
        }

        // for hundreds that are not round
        else if (arrayLength == 3 && numberChar[1] != '0' && numberChar[2] != '0'){
          String firstNumberStr = Character.toString(numberChar[0]);
          Integer firstNumber = Integer.parseInt(firstNumberStr);
          String secondNumberStr = Character.toString(numberChar[1]);
          Integer secondNumber = Integer.parseInt(secondNumberStr);
          String thirdNumberStr = Character.toString(numberChar[2]);
          Integer thirdNumber = Integer.parseInt(thirdNumberStr);

          return inwords.get(firstNumber) + " hundred " + tens.get(secondNumber) +
          "-" + inwords.get(thirdNumber);
        }

        // from 1 to 9
        else {
          String lastNumberStr = Character.toString(numberChar[0]);
          Integer lastNumber = Integer.parseInt(lastNumberStr);
          return inwords.get(lastNumber);
        }
=======
import spark.ModelAndView;

public class NumbersToWords {
    public static void main(String[] args) {}


    public static String finalWord(String number) {


        HashMap<String, String> ones = new HashMap<String, String>();

        ones.put("1","one");
        ones.put("2","two");
        ones.put("3","three");
        ones.put("4","four");
        ones.put("5","five");
        ones.put("6","six");
        ones.put("7","seven");
        ones.put("8","eight");
        ones.put("9","nine");

        //String numberAsString = Integer.toString(number);
        return ones.get(number);

>>>>>>> f8994cd808cf4d3f893434ab2134b307e5b83b71


    }
}

package Misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

public class Utilities {

    public String propertyFile;
    public String environment;
    public ResourceBundle resourcebundle;
    public Date today;
    public String date;
    public Calendar c;
    public SimpleDateFormat DATE_FORMAT;
    public Date currentDatePlusOne;

    //public Utilities() {}

    public String setDate(int adddays) {
        today = new Date();

        //If you print Date, you will get un formatted output
        System.out.println("Today is : " + today);


        //Another Example of formatting Date in Java using SimpleDateFormat
        DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        date = DATE_FORMAT.format(today);
        System.out.println("Today in dd/MM/yy pattern : " + date);

        // convert date to calendar
        c = Calendar.getInstance();
        c.setTime(today);

        // manipulate date
        //c.roll(Calendar.YEAR, 1);
        //c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, adddays); //same with c.add(Calendar.DAY_OF_MONTH, 1);

        currentDatePlusOne = c.getTime();

        System.out.println(DATE_FORMAT.format(currentDatePlusOne));

        return DATE_FORMAT.format(currentDatePlusOne);
    }

    public String generateName() {
        Random rnd = new Random();
        String firstname = "Ikechukwu";
        String lastname = "Lionel";

        String result;

        result = firstname.substring(0, 3); //Character.toString(firstname.charAt(0)); // First char
        if (lastname.length() > 5)
            result += lastname.substring(0, 6);
        else
            result += lastname;
        result += Integer.toString(rnd.nextInt(1000000));
        System.out.println(result);

        return result;
    }

    public String generateRegistrationNumber(String registrationenum) {
        Random rnd = new Random();
        String companyregistrationnumber = "CRN";
        String vatregistrationnumber = "VRN";

        String result = "";

        if (registrationenum.equals( RegistrationNumberEnum.RegistrationNumberType.CRN.toString()))
            result += companyregistrationnumber;
        else if (registrationenum.equals( RegistrationNumberEnum.RegistrationNumberType.VRN.toString()))
            result += vatregistrationnumber;
        result += Integer.toString(rnd.nextInt(1000000));
        System.out.println(result);

        return result;
    }

    public String generateScreenshotName(String ScreenshotName) {
        Random rnd = new Random();
        String result;
        result = ScreenshotName;
        result += Integer.toString(rnd.nextInt(1000000000));
        result += ".jpg";
        System.out.println(result);

        return result;
    }

    public void sleep(Long time) {
        try {

            //sleep 5 seconds
            Thread.sleep(time);

            // System.out.println("Testing..." + new Date());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

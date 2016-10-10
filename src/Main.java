import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Scott Lindley on 10/9/2016.
 */
public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        //I copied this art from http://www.ascii-code.com/ascii-art/sports-and-outdoors/billiards.php
        
        System.out.println("        ____\n" +
                "    ,dP9CGG88@b,\n" +
                "  ,IP  _   Y888@@b,\n" +
                " dIi  (_)   G8888@b\n" +
                "dCII  (_)   G8888@@b\n" +
                "GCCIi     ,GG8888@@@\n" +
                "GGCCCCCCCGGG88888@@@\n" +
                "GGGGCCCGGGG88888@@@@...\n" +
                "Y8GGGGGG8888888@@@@P.....\n" +
                " Y88888888888@@@@@P......\n" +
                " `Y8888888@@@@@@@P'......\n" +
                "    `@@@@@@@@@P'.......\n" +
                "        \"\"\"\"........");
        System.out.println("<<<<<<<< MAGIC 8 BALL >>>>>>>>");
        System.out.println("Step right up and peer into the future.... if you dare....");
        playInput(0);
    }

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(9);
    }

    public static void shakeBall(){
        int randNumber = getRandomNumber();
        System.out.println("Think of your question.");
        System.out.println("Focus and the 8 ball shall read your future....");
        for(int i=5; i>0; i--) {
            printCountDown(i);
            sleeper(1000);
        }
        ArrayList<String> finishedDisplay = printTriangleAnimation();
        switch (randNumber){
            case 0:
                finishedDisplay.set(8, "***************  ********* it **********  ****************");
                finishedDisplay.set(9, "*************  **********  is  ***********  **************");
                finishedDisplay.set(10,"***********  *********   certain   *********  ************");
                break;
            case 1:
                finishedDisplay.set(8, "***************  ******** ask **********  ****************");
                finishedDisplay.set(9, "*************  ********* again  **********  **************");
                finishedDisplay.set(10,"***********  *********   later   ***********  ************");
                break;
            case 2:
                finishedDisplay.set(8, "***************  *******  don't  *******  ****************");
                finishedDisplay.set(9, "*************  ********   count   ********  **************");
                finishedDisplay.set(10,"***********  *********    on it    *********  ************");
                break;
            case 3:
                finishedDisplay.set(8, "***************  ******  without  ******  ****************");
                finishedDisplay.set(9, "*************  *******      a      *******  **************");
                finishedDisplay.set(10,"***********  *********    doubt    *********  ************");
                break;
            case 4:
                finishedDisplay.set(8, "***************  *******  reply  *******  ****************");
                finishedDisplay.set(9, "*************  *********  hazy   *********  **************");
                finishedDisplay.set(10,"***********  *********  try again  *********  ************");
                break;
            case 5:
                finishedDisplay.set(8, "***************  ******  outlook  ******  ****************");
                finishedDisplay.set(9, "*************  ********    not    ********  **************");
                finishedDisplay.set(10,"***********  *********    good     *********  ************");
                break;
            case 6:
                finishedDisplay.set(8, "***************  *******  signs  *******  ****************");
                finishedDisplay.set(9, "*************  ********   point   ********  **************");
                finishedDisplay.set(10,"***********  *********   to yes    ********  ************");
                break;
            case 7:
                finishedDisplay.set(8, "***************  ****  concentrate  ****  ****************");
                finishedDisplay.set(9, "*************  ******    and ask    ******  **************");
                finishedDisplay.set(10,"***********  *******      again      *******  ************");
                break;
            case 8:
                finishedDisplay.set(8, "***************  ******  outlook  ******  ****************");
                finishedDisplay.set(9, "*************  ********    not    ********  **************");
                finishedDisplay.set(10,"***********  *********    good     *********  ************");
                break;
        }
        for(String s: finishedDisplay){
            System.out.println(s);
        }
        playInput(1);
    }

    public static void printCountDown(int seconds){
        switch (seconds){
            case 5:
                System.out.println("5...");
                break;
            case 4:
                System.out.println("4...");
                break;
            case 3:
                System.out.println("3...");
                break;
            case 2:
                System.out.println("2...");
                break;
            case 1:
                System.out.println("1...");
        }
    }

    public static ArrayList<String> printTriangleAnimation(){
        ArrayList<ArrayList<String>> displays = initializeTriangleDisplay();
        for(int i=0; i<displays.get(0).size(); i++){
            displays.get(0).set(i, displays.get(1).get(i));
            for(String s: displays.get(0)){
                System.out.println(s);
                sleeper(15);
            }
        }
        return displays.get(0);
    }

    public static void sleeper(long time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static ArrayList<ArrayList<String>> initializeTriangleDisplay(){
        ArrayList<ArrayList<String>> displays = new ArrayList<>();
        ArrayList<String> triangleLines = new ArrayList<>();
        ArrayList<String> blankLines = new ArrayList<>();

        for(int i=0; i<18; i++){
            blankLines.add("**********************************************************");
        }
        triangleLines.add("**********************************************************");
        triangleLines.add("**********************************************************");
        triangleLines.add("***************************   ****************************");
        triangleLines.add("*************************  ***  **************************");
        triangleLines.add("***********************  *******  ************************");
        triangleLines.add("*********************  ***********  **********************");
        triangleLines.add("*******************  ***************  ********************");
        triangleLines.add("*****************  *******************  ******************");
        triangleLines.add("***************  ***********************  ****************");
        triangleLines.add("*************  ***************************  **************");
        triangleLines.add("***********  *******************************  ************");
        triangleLines.add("*********  ***********************************  **********");
        triangleLines.add("*******  ***************************************  ********");
        triangleLines.add("*****  *******************************************  ******");
        triangleLines.add("***  ***********************************************  ****");
        triangleLines.add("*                                                       **");
        triangleLines.add("**********************************************************");
        triangleLines.add("**********************************************************");


        displays.add(blankLines);
        displays.add(triangleLines);
        return displays;
    }

    public static void playInput(int callingMethod){
        if(callingMethod ==1){
            System.out.println("********************\nPlay again?\n********************");
        }else{
            System.out.println("********************\nReady?\n********************");
        }
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice.toLowerCase()){
            case "yes":
                shakeBall();
                break;
            case "no":
                System.exit(0);
                break;
            default:
                playInput(callingMethod);
        }
    }
}

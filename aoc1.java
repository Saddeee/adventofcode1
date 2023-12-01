import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aoc1{



    public static void main(String[] args) {
        System.out.println(aoc());
    }


    public static int aoc(){
        int summa = 0;
        try{
            BufferedReader file = new BufferedReader(new FileReader("/Users/sadde/kth/repos/aoc/aoc1/text.txt"));
            String line;
            while((line = file.readLine()) != null){
                String cal = "";
                String varde = "";
                for (int i = 0; i < line.length(); i++) {
                    if(Character.isDigit(line.charAt(i))){

                        cal += line.substring(i, i+1);
                    }
                }
                varde += cal.substring(0, 1) + cal.substring(cal.length()-1, cal.length());
                summa += Integer.parseInt(varde);

            }
            
            file.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return summa;
    }
}

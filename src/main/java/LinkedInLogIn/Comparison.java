package LinkedInLogIn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {
    List<String> googleLinks = new ArrayList<>();
    List<String> linkedInLinks = new ArrayList<>();

    public List<String> readGoogleLinksFromCSV() {
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\Google_Results.csv";  // Path to the CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                googleLinks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return googleLinks;
    }

    public List<String> readLinkedInLinksFromCSV() {
        String linkedInFilePath = System.getProperty("user.dir")+"\\src\\main\\resources\\LinkedInResults.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(linkedInFilePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                linkedInLinks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedInLinks;
    }

    public boolean compareTheLists(List<String> google, List<String> linkedIn){

        for(int i = 0 ; i < google.size() ; i++){
            System.out.println(google.get(i));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for(int i = 0 ; i < linkedIn.size() ; i++){
            System.out.println(linkedIn.get(i));
        }

        /** below I'm using the sort method to ensure that the results obtained from google
         * and linked in are not equals regardless the order
         *
         * **/
        Collections.sort(google);
        Collections.sort(linkedIn);

        return google.equals(linkedIn);
    }

}

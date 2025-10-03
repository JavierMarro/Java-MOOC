package JavaMOOC2.Part10.Exercise14ComparableInterfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

//This exercise uses open data about literacy levels, provided by UNESCO. 
// File literacy.csv, included with the exercise template, includes the literacy estimates for women and men over 15 years of age. 
// Each line in the file literacy.csv is as follows: "theme, age group, gender, country, year, literacy percent.
public class LiteracyComparison {
    public static void main(String[] args) {

    try {
      Files.lines(Paths.get("literacy.csv"))
        .map(row -> row.split(","))
        .sorted((countryOneYear, countryTwoYear) -> countryOneYear[5].compareTo(countryTwoYear[5]))
        .forEach(countryInfo -> System.out.println(countryInfo[3] + " (" + Integer.valueOf(countryInfo[4]) + "), " + countryInfo[2].split(" ")[1].trim() + ", " + Double.parseDouble(countryInfo[5])));

    } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
    }

  }

  // Model answer
//   public static void main(String[] args) {
 
//         ArrayList<Result> results = new ArrayList<>();
//         try {
//             Files.lines(Paths.get("literacy.csv"))
//                     .map(l -> l.split(","))
//                     .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
//                     .forEach(t -> results.add(t));
//         } catch (IOException ex) {
//             System.out.println("Error reading file.");
//         }
        
//         results.stream().sorted((t1, t2) -> {
//             if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
//                 return 1;
//             }
//             if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
//                 return -1;
//             }
//             return 0;
//         }).forEach(t -> System.out.println(t));
//     }
}





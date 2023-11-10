import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/goroda.csv"));
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(";");
            City city = new City();
            city.name = s[1];
            city.region  = s[2];
            city.district = s[3];
            city.population = s[4];
            if(s.length==6){
                city.foundation = s[5];
            }
            System.out.println(city);
        }
    }
}
class City{
    public String name;
    public String region;
    public String district;
    public String population;
    public String foundation;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population='" + population + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
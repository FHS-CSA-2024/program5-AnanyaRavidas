//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args) {
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        int royaleMiles = 286;
        int royaleGallons = 9;
        double average = 0;
        average = (double) royaleMiles/royaleGallons;
        average = (int) (10 * average);
        average += 1;
        average = (double) average/10;
        System.out.print("Royale averaged " + average);
        System.out.println(" m/g");
        
        int KoopaKingMiles = 412;
        int KoopaKingGallons = 40;
        average = (double) KoopaKingMiles/KoopaKingGallons;
        average = (int) (10 * average);
        average = (double) average/10;
        System.out.print ("Koopa King averaged " + average);
        System.out.println(" m/g");
        
        int PipeFrameMiles = 361;
        int PipeFrameGallons = 18;
        average = (double) PipeFrameMiles/PipeFrameGallons;
        average = (int) (10 * average);
        average += 1;
        average = (double) average/10;
        System.out.print ("Pipe Frame averaged " + average);
        System.out.println(" m/g");
        
        int BadwagonMiles = 161;
        int BadwagonGallons = 11;
        average = (double) BadwagonMiles/BadwagonGallons;
        average = (int) (10 * average);
        average = (double) average/10;
        System.out.print ("Badwagon averaged " + average);
        System.out.println(" m/g");
        
        
        
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g

*/

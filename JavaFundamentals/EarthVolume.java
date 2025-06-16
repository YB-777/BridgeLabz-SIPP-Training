import java.util.*;
public class EarthVolume 
{
    public static void main(String[] args) 
    {
        double earthRadius = 6378; 
        double volumeKm = (4.0/3) * Math.PI * Math.pow(earthRadius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3); 
        
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm + 
                           " and in cubic miles is " + volumeMiles);
    }
}
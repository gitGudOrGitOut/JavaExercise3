

package uk.ac.tees.advanced.template.v8002382;

/** <p>A class which stores environmental data about Mars. This class is used
 * by robots on Mars to determine if it is safe to operate.</p>
 *
 * Based on work created by Mark Truran. </p>
 */
public class Environment {
    
    /**
     * A measurement of ambient radiation levels.
     */
    public static RadiationLevel radiationLevel = RadiationLevel.LOW;
    
    /**
     * Is a dust storm pounding the planet?.
     */
    public static boolean dustStorm = false;

    /** This method sets the ambient radiation levels. 
     * 
     * @param radiationLevel The ambient radiation levels 
     */
    public static void setRadiationLevel(RadiationLevel radiationLevel) {
        Environment.radiationLevel = radiationLevel;
    }

    /** This method is invoked when a dust storm develops.
     * 
     * @param dustStorm true if dust storms are approaching
     */
    public static void setDustStorm(boolean dustStorm) {
        Environment.dustStorm = dustStorm;
    }
    
}
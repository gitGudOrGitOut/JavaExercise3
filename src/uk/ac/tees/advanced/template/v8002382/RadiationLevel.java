package uk.ac.tees.advanced.template.v8002382;

/** <p>An enumeration of the various levels of radiation a robot can experience 
 * on Mars.</p>
 *
 * Based on work created by Mark Truran. </p>
 */
public enum RadiationLevel {
    /**
     * Low radiation levels, scanning robots can operate normally.
     */
    LOW, 
    /**
     * Medium radiation levels, scanning robots can operate but there is some 
     * interference.
     */
    MEDIUM, 
    /**
     * High radiation levels, scanning robots cannot operate.
     */
    HIGH, 
    /**
     * Critical radiation levels, scanning robots cannot operate.
     */
    CRITICAL
}

package motionwave.core;

/**
 * Duration class to represent a duration of time in hours, minutes, and
 * seconds.
 * Provides methods to create a duration from total seconds and to format the
 * duration as a string.
 * 
 * @author nevesrodrigo2 (Rodrigo Neves)
 */
public class Duration {
    private int seconds;
    private int minutes;
    private int hours;
    private int totalSeconds;

    /**
     * Constructor to create a Duration object from hours, minutes, and seconds.
     * 
     * @param totalSeconds
     * @requires totalSeconds >= 0
     * @ensures this.seconds = totalSeconds % 60
     *          this.minutes = (totalSeconds / 60) % 60
     *          this.hours = (totalSeconds / 3600) % 24
     */
    public Duration(int totalSeconds) {

        this.totalSeconds = totalSeconds;
        this.seconds = totalSeconds % 60;
        this.minutes = (totalSeconds / 60) % 60;
        this.hours = (totalSeconds / 3600) % 24;
    }

    /**
     * Gets the total seconds of the duration.
     * @return the total seconds of the duration
     */
    public int getTotalSeconds() {
        return totalSeconds;

    }
    
    /**
     * Gets the seconds of the duration.
     * 
     * @return the seconds of the duration
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Gets the minutes of the duration.
     * 
     * @return the minutes of the duration
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Gets the hours of the duration.
     * 
     * @return the hours of the duration
     */
    public int getHours() {
        return hours;
    }

    /**
     * Converts the duration to a string representation.
     * Example: "01:30:45" for 1 hour, 30 minutes, and 45 seconds.
     * "30:45" for 30 minutes and 45 seconds.
     * 
     * @return the string representation of the duration
     */
    public String toString() {
        if (hours > 0) {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}

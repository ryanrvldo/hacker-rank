package id.ryanrvldo.hackerrank.problemsolving;

/**
 * Link : <a>https://www.hackerrank.com/challenges/time-conversion/problem</a>
 *
 * @version : 1
 * @implSpec JDK 8 or higher
 **/
class TimeConversion {

    /**
     * @param input String in 12-Hour Time Format
     * @return String in 24-Hour Time Format
     */
    static String solution(String input) {
        String dateString = input.substring(0, input.length() - 2);
        boolean isPM = input.startsWith("PM", input.length() - 2);
        int hour = Integer.parseInt(dateString.substring(0, 2));

        if (isPM) {
            if (hour != 12) {
                dateString = (hour + 12) + dateString.substring(2);
            }
        } else {
            if (hour == 12) {
                dateString = "00" + dateString.substring(2);
            }
        }
        return dateString;
    }

}

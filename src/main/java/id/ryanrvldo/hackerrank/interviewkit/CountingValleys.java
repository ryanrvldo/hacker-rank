package id.ryanrvldo.hackerrank.interviewkit;

/**
 * Link : <a>https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen</a>
 *
 * @version : 1
 * @implSpec JDK 8 or higher
 **/
class CountingValleys {


    /**
     * @param steps the number of steps on the hike
     * @param path  a string describing the path
     * @return the number of valleys traversed
     */
    static int solution(int steps, String path) {
        if (steps != path.length()) {
            throw new IllegalArgumentException("Steps is not equal to Path length");
        }

        int totalValleys = 0;
        int seaLevel = 0;

        for (char c : path.toCharArray()) {
            if (c == 'U') seaLevel++;
            if (c == 'D') seaLevel--;

            if (seaLevel == 0 && c == 'U') {
                totalValleys++;
            } else if (c != 'U' && c != 'D') {
                throw new IllegalArgumentException("Path is invalid!");
            }
        }
        return totalValleys;
    }

}

package id.ryanrvldo.hackerrank.interviewkit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Link : <a>https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup</a>
 *
 * @version : 1
 * @implSpec JDK 8 or higher
 **/
class SockMerchant {

    /**
     * @param n  the number of socks in the pile
     * @param ar the colors of each stock
     * @return the number of matching pairs of socks that are available
     */
    static int solution(int n, int[] ar) {
        if (n != ar.length) return 0;

        Arrays.sort(ar);
        int totalPairs = 0;

        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                totalPairs++;
                i++;
            }
        }
        return totalPairs;
    }

    static int optionalSolution(int n, int[] ar) {
        if (n != ar.length) return 0;

        Set<Integer> sockSet = new HashSet<>();
        int totalPairs = 0;

        for (int i = 0; i < n; i++) {
            int sock = ar[i];
            if (sockSet.contains(sock)) {
                sockSet.remove(sock);
                totalPairs++;
            } else {
                sockSet.add(sock);
            }
        }
        return totalPairs;
    }

}

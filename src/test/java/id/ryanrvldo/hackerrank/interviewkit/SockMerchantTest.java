package id.ryanrvldo.hackerrank.interviewkit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class SockMerchantTest {

    @Test
    @DisplayName("Test there is not matching socks should returns 0 total pairs of socks")
    void testThereIsNotMatchingSocks_ReturnZeroTotalPairsOfStock() {
        int totalDummySocks = 7;
        int[] dummySocks = {1, 2, 3, 4, 5, 6, 7};

        int result = SockMerchant.solution(totalDummySocks, dummySocks);

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Test total socks param is not equal to socks array size should returns 0 total pairs of socks")
    void testTotalSocksParamIsNotEqualToSocksArraySize_ReturnZeroTotalPairsOfStock() {
        int totalDummySocks = 8;
        int[] dummySocks = {1, 2, 3, 4, 5, 6, 7};

        int result = SockMerchant.solution(totalDummySocks, dummySocks);

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Test there is matching socks should returns total pairs of socks")
    void testThereIsMatchingSocks_ReturnsTotalPairsOfSocks() {
        int totalDummySocks = 7;
        int[] dummySocks = {1, 2, 1, 2, 1, 3, 2};

        int result = SockMerchant.solution(totalDummySocks, dummySocks);

        assertThat(result).isEqualTo(2);

    }

    @Test
    @DisplayName("Test sample problem in HackerRank")
    void testSampleProblem_ReturnsTotalPairsOfSocks() {
        int totalDummySocks = 9;
        int[] dummySocks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = SockMerchant.solution(totalDummySocks, dummySocks);

        assertThat(result).isEqualTo(3);
    }

}
class Solution {
    public int lastStoneWeight(int[] stones) {

        if (stones.length == 0) {
            return 0;
        } else if (stones.length == 1) {
            return stones[0];
        }

        while (stones.length > 1) {

            int largest;
            int secLar;

            int largestIndex;
            int secLarIndex;

            if (stones[0] > stones[1]) {
                largest = stones[0];
                largestIndex = 0;
                secLar = stones[1];
                secLarIndex = 1;
            } else {
                largest = stones[1];
                largestIndex = 1;
                secLar = stones[0];
                secLarIndex = 0;
            }

            // Find largest and second largest
            for (int i = 2; i < stones.length; i++) {

                if (stones[i] > largest) {
                    secLar = largest;
                    secLarIndex = largestIndex;

                    largest = stones[i];
                    largestIndex = i;

                } else if (stones[i] > secLar) {
                    secLar = stones[i];
                    secLarIndex = i;
                }
            }

            // Smash the two largest stones
            int x = largest - secLar;

            // Create the new array
            int newLength;

            if (x > 0) {
                newLength = stones.length - 1;
            } else {
                newLength = stones.length - 2;
            }

            int[] newStones = new int[newLength];

            // Copy everything except the two smashed stones
            int k = 0;

            for (int i = 0; i < stones.length; i++) {

                if (i != largestIndex && i != secLarIndex) {
                    newStones[k] = stones[i];
                    k++;
                }
            }

            // Add the remaining stone if there is one
            if (x > 0) {
                newStones[k] = x;
            }

            // Replace old array
            stones = newStones;
        }

        // Either no stones or one stone remains
        if (stones.length == 0) {
            return 0;
        }

        return stones[0];
    }
}

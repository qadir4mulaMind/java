public class BitwiseLogicalOperations {
    // 1. Swap two numbers using XOR
    static int[] swap(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        return new int[]{a, b};
    }

    // 2. Check if a number is odd/even
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // 3. Multiply/divide by 2 using << / >>
    static int mulBy2(int n) { return n << 1; }
    static int divBy2(int n) { return n >> 1; }

    // 4. Check if a number is power of 2
    static boolean isPowerOf2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 5. Count set bits (Brian Kernighan)
    static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    // 6. Toggle k-th bit
    static int toggleKthBit(int n, int k) {
        return n ^ (1 << k);
    }

    // 7. Set/clear/check k-th bit
    static int setKthBit(int n, int k) { return n | (1 << k); }
    static int clearKthBit(int n, int k) { return n & ~(1 << k); }
    static boolean checkKthBit(int n, int k) { return (n >> k & 1) == 1; }

    // 8. Find single non-repeating element
    static int singleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) result ^= num;
        return result;
    }

    // 9. Find two non-repeating elements
    static int[] twoNonRepeating(int[] arr) {
        int xor = 0;
        for (int num : arr) xor ^= num;
        int rightmostSetBit = xor & -xor;
        int x = 0, y = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) x ^= num;
            else y ^= num;
        }
        return new int[]{x, y};
    }

    // 10. Check if two integers have opposite signs
    static boolean oppositeSigns(int a, int b) {
        return (a ^ b) < 0;
    }

    // 11. Counting set bits for all 0..n
    static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    // 12. Add two numbers without +
    static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^= b;
            b = carry;
        }
        return a;
    }

    // 13. Subtract without -
    static int subtractWithoutMinus(int a, int b) {
        return addWithoutPlus(a, ~b + 1);
    }

    // 14. Multiply without *
    static int multiplyWithoutStar(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) result = addWithoutPlus(result, a);
            a <<= 1;
            b >>>= 1;
        }
        return result;
    }

    // 15. Divide without /
    static int divideWithoutDiv(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        int quotient = 0;
        while (a >= b) {
            int curr = b, q = 1;
            while ((curr << 1) <= a && (curr << 1) > 0) {
                curr <<= 1;
                q <<= 1;
            }
            a = subtractWithoutMinus(a, curr);
            quotient = addWithoutPlus(quotient, q);
        }
        return quotient;
    }

    // 16. Check alternating bits
    static boolean hasAlternatingBits(int n) {
        return ((n ^ (n >> 1)) & ((1 << Integer.toBinaryString(n).length()) - 1))
                == ((1 << Integer.toBinaryString(n).length()) - 1);
    }

    // 17. Reverse bits in 32-bit integer
    static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>>= 1;
        }
        return result;
    }

    // 18. Extract k bits from position p
    static int extractBits(int n, int p, int k) {
        return (n >> p) & ((1 << k) - 1);
    }

    // 19. Update bits in range [i,j]
    static int updateBits(int n, int m, int i, int j) {
        int mask = ((1 << (j - i + 1)) - 1) << i;
        return (n & ~mask) | ((m << i) & mask);
    }

    // 20. Insert M into N at pos range
    static int insertBits(int N, int M, int i, int j) {
        int mask = ((1 << (j - i + 1)) - 1) << i;
        return (N & ~mask) | ((M << i) & mask);
    }

    // 21. Next higher number with same bit count
    static int nextHigherSameBits(int n) {
        int c = n & -n;
        int t = n + c;
        return t | (((t ^ n) >> 2) / c);
    }

    // 22. Compute n’s Gray code
    static int grayCode(int n) {
        return n ^ (n >> 1);
    }

    // 23. Convert Gray code to binary
    static int grayToBinary(int n) {
        int result = n;
        while (n != 0) {
            n >>= 1;
            result ^= n;
        }
        return result;
    }

    // 24. Count trailing zeros
    static int countTrailingZeros(int n) {
        if (n == 0) return 32;
        return Integer.numberOfTrailingZeros(n);
    }

    // 25. Find rightmost set bit index
    static int rightmostSetBit(int n) {
        if (n == 0) return -1;
        return Integer.numberOfTrailingZeros(n);
    }

    // 26. Check if n has only one zero bit
    static boolean hasOneZeroBit(int n) {
        return isPowerOf2(~n);
    }

    // 27. Compute bitwise AND from m to n
    static int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
    }

    // 28. Check if two numbers differ by exactly one bit
    static boolean differByOneBit(int a, int b) {
        return isPowerOf2(a ^ b);
    }

    // 29. Find Hamming distance between two integers
    static int hammingDistance(int a, int b) {
        return countSetBits(a ^ b);
    }

    // 30. Find max XOR of any subarray
    static int maxXorSubarray(int[] arr) {
        int maxXor = 0, currXor = 0;
        for (int num : arr) {
            currXor ^= num;
            maxXor = Math.max(maxXor, currXor);
        }
        return maxXor;
    }

    // 31. Find pair with max XOR in array
    static int maxXorPair(int[] arr) {
        int maxXor = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                maxXor = Math.max(maxXor, arr[i] ^ arr[j]);
        return maxXor;
    }

    // 32. Subset generation using bitmasking
    static int[][] generateSubsets(int[] arr) {
        int n = arr.length;
        int[][] subsets = new int[1 << n][];
        for (int i = 0; i < (1 << n); i++) {
            java.util.List<Integer> subset = new java.util.ArrayList<>();
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0) subset.add(arr[j]);
            subsets[i] = subset.stream().mapToInt(Integer::intValue).toArray();
        }
        return subsets;
    }

    // 33. Quick range check: x > 5 && x < 10
    static boolean inRange(int x) {
        return x > 5 && x < 10;
    }

    // 34. Short-circuit evaluation
    static boolean safeAccess(int[] arr, int i) {
        return i < arr.length && arr[i] > 0;
    }

    // 35. Check divisibility by power of two
    static boolean divisibleByPowerOf2(int n, int k) {
        return (n & ((1 << k) - 1)) == 0;
    }

    // 36. Compute sign of integer
    static int getSign(int n) {
        return (n >> 31) & 1;
    }

    // 37. Swap variables using addition/subtraction
    static int[] swapAddSub(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    // 38. Toggle permissions flags
    static int togglePermission(int flags, int perm) {
        return flags ^ perm;
    }

    // 39. Logical XOR on booleans
    static boolean logicalXor(int a, int b, int c, int d) {
        return (a > b) != (c < d);
    }

    // 40. Compact multi-condition chain
    static boolean multiCondition(int a, int b, int c, int d) {
        return (a == b && c > 0) || (c == d && b < 0);
    }

    // 41. Assert chain using logical AND
    static boolean checkValid(Integer obj) {
        return obj != null && obj > 0;
    }

    // 42. Avoid divide-by-zero
    static boolean safeDivide(int num, int den, int k) {
        return den != 0 && num / den > k;
    }

    // 43. Cascade OR fallback
    static boolean fallback(boolean f1, boolean f2, boolean f3) {
        return f1 || f2 || f3;
    }

    // 44. Lazy initialization
    static boolean lazyInit(Integer obj, boolean init) {
        return obj == null && init;
    }

    // 45. Check if two floats are extremely close
    static boolean areClose(float a, float b, float epsilon) {
        return !(Math.abs(a - b) > epsilon);
    }

    // 46. Test bit palindrome
    static boolean isBitPalindrome(int n) {
        String bits = Integer.toBinaryString(n);
        int left = 0, right = bits.length() - 1;
        while (left < right) {
            if (bits.charAt(left++) != bits.charAt(right--)) return false;
        }
        return true;
    }

    // 47. Swap nibble halves in byte
    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4) | ((x & 0xF0) >> 4);
    }

    // 48. Round down to nearest power of 2
    static int roundDownPower2(int n) {
        if (n == 0) return 0;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return (n + 1) >> 1;
    }

    // 49. Logical masks for flags
    static boolean manageFlags(int flags, int setFlag, int checkFlag) {
        flags |= setFlag;
        return (flags & checkFlag) != 0;
    }

    // 50. Selective enabling/disabling features
    static int toggleFeatures(int flags, int enable, int disable) {
        flags |= enable;
        flags &= ~disable;
        return flags;
    }

    // Main for testing (example for problem 1)
    public static void main(String[] args) {
        int[] result = swap(5, 10);
        System.out.println("Swap: " + result[0] + ", " + result[1]); // Output: 10, 5
    }
}
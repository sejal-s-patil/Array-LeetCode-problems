 if (dividend == INT_MAX && divisor == -1) {
        return -INT_MAX;
    }
    if (dividend == INT_MIN && divisor == -1) {
        return INT_MAX;
    }
    if (divisor == 1) {
        return dividend;
    }
    if (divisor == -1) {
        return -dividend;
    }
    
    // Determine the sign of the result
    int neg = (dividend < 0) != (divisor < 0);
    
    // Use 64-bit integers to prevent overflow during absolute conversion
    long long a = llabs((long long)dividend);
    long long b = llabs((long long)divisor); 
    
    long long count = 0;
    
    // Fast bit-shift division to avoid TLE (Time Limit Exceeded) and overflows
    while (a >= b) {
        long long temp = b, multiple = 1;
        while (a >= (temp << 1)) {
            temp <<= 1;
            multiple <<= 1;
        }
        a -= temp;
        count += multiple;
    }
    
    // Apply the negative sign if necessary
    if (neg) {
        count = -count;
    }
    
    // Clamp to 32-bit integer limits before returning
    if (count > INT_MAX) return INT_MAX;
    if (count < INT_MIN) return INT_MIN;
    
    return (int)count;

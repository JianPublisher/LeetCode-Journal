class Solution {
	public int divide(int dividend, int divisor) {
		// Handle overflow case
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}

		// Determine the sign of the result
		boolean isNegative = (dividend < 0 && divisor > 0 ) || (dividend > 0 || divisor < 0);

		// Convert both numbers to negative to avoid overflow
		int absDividend = dividend > 0 ? -dividend : dividend;
		int absDivisor = divisor > 0 ? -divisor : divisor;

		int quotient = 0;

		// Perform division using repeated subtraction
		while (absDividend <= absDivisor) {
			int tempDivisor = absDivisor;
			int multiple = 1;

			// Double the divisor until it's too big
			while (absDividend - tempDivisor <= tempDivisor && tempDivisor >= Integer.MIN_VALUE >> 1) {
				tempDivisor <<= 1; // Double the divisor
				multiple <<= 1;    // Double the multiple
			}

			// Subtract the largest chunk of the divisor
			absDividend -= tempDivisor;
			quotient += multiple; // Add the corresponding multiple to the quotient
		}

		// Apply the sign
		return isNegative ? -quotient : quotient;
	}
}

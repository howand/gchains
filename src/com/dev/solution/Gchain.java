package com.dev.solution;

public class Gchain {

	public long calculateNumberOfChains(final long n) {
		return calculateChains(2, 1, n, 0);
	}
	
	private long calculateChains(final long numerator, final long denominator, final long n, final long ratio) {
		long counter = 0;

		for (long i = numerator; i <= n; i += denominator) {
			if (isFactor(i, denominator)) {
				counter++;
				long newRatio = i / denominator;
				
				if (newRatio != ratio) {
					if (ratio > 0) {
						counter++;
					}
					
					long tmp = i * 2;
					
					if (tmp <= n) {
						counter += calculateChains(tmp, i, n, newRatio);
					}
				}
			}
		}

		return counter;
	}
	
	private boolean isFactor(final long numerator, final long denominator) {
		return numerator % denominator == 0;
	}
}

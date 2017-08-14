package com.pragone.jphash.image.radial;

import com.pragone.jphash.util.HexUtil;

/**
 * User: krishnact Date: 08/08/2016 Time: 11:50 PM
 */
public class RadialHash
{
	private final int[] coefficients;

	public RadialHash(int numberOfcoefficients1)
	{
		this.coefficients = new int[numberOfcoefficients1];
	}

	public int[] getCoefficients()
	{
		return coefficients;
	}

	@Override
	public String toString()
	{
		return HexUtil.intArrayToString(coefficients);
	}

	public static RadialHash fromString(String string)
	{
		RadialHash temp = new RadialHash(string.length() / 2);
		// HexUtil.stringToByteArray(string, temp.coefficients1);
		HexUtil.stringToIntArray(string, temp.coefficients);
		return temp;
	}

}

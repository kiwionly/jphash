package com.pragone.jphash.image.radial;

import com.pragone.jphash.util.HexUtil;

/**
 * User: krishnact Date: 08/08/2016 Time: 11:50 PM
 */
public class RadialHash
{
	private final int[] coefficients;

	public RadialHash(int size)
	{
		this.coefficients = new int[size];
	}
	
	public RadialHash(int[] coefficients)
	{
		this.coefficients = coefficients;
	}
	
	public RadialHash(String hash)
	{
		this.coefficients = HexUtil.stringToIntArray(hash);
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

}

package converter;

/**
 * Set instance value of length.
 * 
 * @author Worawat chueajedton
 *
 */
public enum Length {
	Mile(1609.344), Kilometer(1000.0), Meter(1.0), Centimeter(0.01), foot(0.30480), wa(2.0), AU(149597870700.0);

	private final double value;

	/**
	 * Set the length.
	 * 
	 * @param value
	 */
	private Length(double value) {
		this.value = value;
	}

	/**
	 * Get the length.
	 * 
	 * @return
	 */
	public double getValue() {
		return this.value;
	}
}

/*
* This file is part of SudoQual project.
*/
package fr.abes.sudoqual.rule_engine;

import java.util.List;
import java.util.Set;
import fr.abes.sudoqual.rule_engine.exception.RuleEngineException;

/**
 * The Interface DiscretCompType.
 */
public interface DiscretCompType {

	/** The Constant NEUTRAL. */
	int NEUTRAL = 0;
	public static String NEUTRAL_KEY = "neutral";

	/** The Constant ALWAYS. */
	int ALWAYS = Integer.MAX_VALUE;
	public static String ALWAYS_KEY = "always";

	/** The Constant NEVER. */
	int NEVER = Integer.MIN_VALUE;
	public static String NEVER_KEY = "never";

	/** The Constant NOT_COMPARABLE. */
	int NOT_COMPARABLE = NEVER + 1;
	public static String NOT_COMPARABLE_KEY = "not_comparable";

	/** The Constant INCOHERENT. */
	int INCOHERENT = ALWAYS - 1;
	public static String INCOHERENT_KEY = "incoherent";

	int ERROR = NOT_COMPARABLE;

	List<String> acceptableValues();

	/**
	 * Gets the max value.
	 *
	 * @return the max value
	 */
	int getMaxValue();

	/**
	 * Gets the min value.
	 *
	 * @return the min value
	 */
	int getMinValue();
	
	/**
	 * Checks if the given value is an acceptable value for this discretCompType
	 * @param value the value to check
	 * @return true if the given value is an acceptable value, false otherwise.
	 */
	public boolean check(int value);
	
	/**
	 * Checks if the given String value is an acceptable value for this discretCompType
	 * @param value the String value to check
	 * @return true if the given value is an acceptable value, false otherwise.
	 */
	public boolean check(String value);
	
	public String toString(int value) throws RuleEngineException;

	int toInt(String value) throws RuleEngineException;


}

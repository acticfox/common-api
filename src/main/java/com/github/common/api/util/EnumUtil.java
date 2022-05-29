package com.github.common.api.util;

import java.util.Arrays;
import java.util.function.Predicate;

import com.github.common.api.enums.IntEnum;

/**
 * @author fanyong.kfy
 */
public class EnumUtil {

	public static <T extends IntEnum> T valuesOfCode(Class<T> enumType, Integer code) {
		if (code == null) {
			return null;
		}
		return Arrays.stream(enumType.getEnumConstants()).filter(e -> e.getCode() == code).findFirst().orElse(null);
	}

	public static <T extends Enum<?>> T valueOfNameIgnoreCase(Class<T> enumeration, String name) {
		return Arrays.stream(enumeration.getEnumConstants()).filter(e -> e.name().equalsIgnoreCase(name)).findFirst()
				.orElse(null);

	}

	public static <T> T valuesOf(Class<T> enumType, Predicate<T> predicate) {
		return Arrays.stream(enumType.getEnumConstants()).filter(predicate).findFirst().orElse(null);
	}

	public static <T extends IntEnum> boolean checkEnumCode(Class<T> enumType, Integer code) {
		return valuesOfCode(enumType, code) != null;
	}

}

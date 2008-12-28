package com.google.gson;

import java.lang.reflect.Type;

import com.googlecode.gentyref.AbstractGenericsReflectorTest;
import com.googlecode.gentyref.GenericTypeReflector;

/**
 * Tests the reflection in Gson using the test classes from gentyref.
 * Note: this test is not really complete, it does not test gson as hard as GenTyRef is tested.
 * It just checks if types are seen as a supertype or not
 * because Gson doesn't have a counterpart for {@link GenericTypeReflector#getExactSuperType(Type, Class)}.
 */
public class GsonGenericsReflectorTest extends AbstractGenericsReflectorTest {

	public GsonGenericsReflectorTest() {
		super(new GsonReflectionStrategy());
	}
}

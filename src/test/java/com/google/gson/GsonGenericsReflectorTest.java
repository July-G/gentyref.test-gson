package com.google.gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.googlecode.gentyref.AbstractGenericsReflectorTest;

// Note: this test is not really complete, it just checks if it's seen as a supertype or not
public class GsonGenericsReflectorTest extends AbstractGenericsReflectorTest {
	@Override
	protected void testExactSuperclass(Type expectedSuperclass, Type type) {
		testSupertype(expectedSuperclass, type);
	}
	
	@Override
	protected void testInexactSupertype(Type superType, Type subType) {
		testSupertype(superType, subType);
	}
	
	private void testSupertype(Type superType, Type subType) {
		assertTrue(superType + " supertype of " + subType, TypeToken.get(superType).isAssignableFrom(subType));
	}
	
	@Override
	protected Type getExactReturnType(Method m, Type type) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	protected Type getExactFieldType(Field f, Type type) {
		return TypeInfoFactory.getTypeInfoForField(f, type).getActualType();
	}
}

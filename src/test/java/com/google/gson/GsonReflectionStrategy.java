/**
 * 
 */
package com.google.gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.googlecode.gentyref.ReflectionStrategy;

class GsonReflectionStrategy implements ReflectionStrategy {

	public Type getFieldType(Type type, Field f) {
		return TypeInfoFactory.getTypeInfoForField(f, type).getActualType();
	}

	public Type getReturnType(Type type, Method m) {
		throw new UnsupportedOperationException();
	}

	public boolean isSupertype(Type supertype, Type subtype) {
		return TypeToken.get(supertype).isAssignableFrom(subtype);
	}

	public void testExactSuperclass(Type expectedSuperclass, Type type) {
		// do nothing
	}

	public void testInexactSupertype(Type supertype, Type subtype) {
		// do nothing
	}
}
/*
 * Copyright 2016-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.junitpioneer.jupiter.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DefaultObjectMapperProvider implements ObjectMapperProvider {

	public DefaultObjectMapperProvider() {
		// recreate default constructor to prevent compiler warning
	}

	@Override
	public ObjectMapper get() {
		return new ObjectMapper();
	}

	@Override
	public String id() {
		return "default";
	}

}
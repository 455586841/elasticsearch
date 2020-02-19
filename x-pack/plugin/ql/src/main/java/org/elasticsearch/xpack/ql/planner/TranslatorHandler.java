/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.ql.planner;

import org.elasticsearch.xpack.ql.expression.Expression;
import org.elasticsearch.xpack.ql.expression.function.scalar.ScalarFunction;
import org.elasticsearch.xpack.ql.querydsl.query.Query;

/**
 * Parameterized handler used during query translation.
 * 
 * Provides contextual utilities for an individual query to be performed.
 */
public interface TranslatorHandler {

    Query asQuery(Expression e);

    Query wrapFunctionQuery(ScalarFunction sf, Expression field, Query q);

    String nameOf(Expression e);

    String dateFormat(Expression e);
}

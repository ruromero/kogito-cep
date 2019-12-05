/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.redhat.syseng.businessautomation.cep.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Result {

    private static final Logger LOGGER = LoggerFactory.getLogger(Result.class);

    private String value1;
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value) {
        LOGGER.debug("Value1 set to {}", value);
        this.value1 = value;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value) {
        LOGGER.debug("Value2 set to {}", value);
        this.value2 = value;
    }
}

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

    private String value;

    public String getValue() {
        if (value == null) {
            return "keep trying, mate.";
        }
        return value;
    }

    public void setValue(String value) {
        LOGGER.debug("Value set to {}", value);
        this.value = value;
    }

}

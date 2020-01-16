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

package com.redhat.syseng.businessautomation.cep.services;

import javax.enterprise.context.ApplicationScoped;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class ExampleRuleRuntimeEventListener implements RuleRuntimeEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleRuleRuntimeEventListener.class);

    @Override
    public void objectInserted(ObjectInsertedEvent event) {
        LOGGER.debug("Inserted: {}", event);
    }

    @Override
    public void objectUpdated(ObjectUpdatedEvent event) {
        LOGGER.debug("Updated: {}", event);
    }

    @Override
    public void objectDeleted(ObjectDeletedEvent event) {
        LOGGER.debug("Deleted: {}", event);
    }
}

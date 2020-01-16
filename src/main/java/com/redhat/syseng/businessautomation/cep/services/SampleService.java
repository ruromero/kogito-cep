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

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.json.JsonObject;

import com.redhat.syseng.businessautomation.cep.model.Event;
import io.cloudevents.Attributes;
import io.cloudevents.CloudEvent;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;
import org.kie.kogito.rules.KieRuntimeBuilder;
import org.kie.kogito.rules.RuleUnitInstance;
import org.kie.kogito.rules.impl.SessionData;
import org.kie.kogito.rules.impl.SessionUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class SampleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);
//    @Named("simpleCEPKS")
//    SessionUnit sessionUnit;

    KieSession kieSession;

    @Inject
    @Named("simpleCEPKS")
    SampleService(KieRuntimeBuilder runtimeBuilder) {
        this.kieSession = runtimeBuilder.newKieSession();
    }

    SessionData data = new SessionData();

    RuleUnitInstance<SessionData> instance;

    @PostConstruct
    void init() {
//        instance = sessionUnit.createInstance(data);
//        KieServices kieServices = KieServices.Factory.get();
//        session = kieServices.getKieClasspathContainer().newKieSession("simpleCEPKS");

    }

    public void run(CloudEvent<? extends Attributes, JsonObject> event) {
//        data.add(event);
//        instance.fire();
        kieSession.insert(event);
        kieSession.fireAllRules();
        LOGGER.debug("Facts in WM: {}",kieSession.getFactCount());
    }

    public void run(Event event) {
//        data.add(event);
//        instance.fire();
        kieSession.insert(event);
        kieSession.fireAllRules();
        LOGGER.debug("Facts in WM: {}",kieSession.getFactCount());
    }

    public String getValue() {
        return null;
    }
}

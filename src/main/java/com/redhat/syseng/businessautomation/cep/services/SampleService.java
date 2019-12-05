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
import javax.inject.Named;
import javax.json.JsonObject;

import com.redhat.syseng.businessautomation.cep.model.Result;
import io.cloudevents.Attributes;
import io.cloudevents.CloudEvent;
import org.kie.kogito.rules.impl.SessionData;
import org.kie.kogito.rules.impl.SessionUnit;

@ApplicationScoped
public class SampleService {

    @Named("simpleCEPKS")
    SessionUnit ruleUnit;

    public String run(CloudEvent<? extends Attributes, JsonObject> event) {
        Result result = new Result();

        SessionData data = new SessionData();
        data.add(event);
        data.add(result);

        ruleUnit.evaluate(data);
        return result.getValue1();
    }
}

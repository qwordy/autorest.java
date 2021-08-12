/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.fluentmodel.method;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.FluentInterfaceStage;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceLocalVariables;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ClientMethodParameter;
import com.azure.autorest.model.clientmodel.ClientModelProperty;
import com.azure.autorest.model.clientmodel.ReturnValue;
import com.azure.autorest.model.javamodel.JavaJavadocComment;
import com.azure.autorest.template.prototype.MethodTemplate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FluentParentMethod extends FluentMethod {

    public FluentParentMethod(FluentResourceModel model, FluentMethodType type,
                              FluentInterfaceStage stage, String parentResourceName,
                              List<ClientMethodParameter> parameters, ResourceLocalVariables resourceLocalVariables) {
        super(model, type);

        this.parameters = parameters;

        this.name = "withExisting" + parentResourceName;
        this.description = String.format("Specifies %1$s.", parameters.stream().map(ClientMethodParameter::getName).collect(Collectors.joining(", ")));
        this.interfaceReturnValue = new ReturnValue("the next definition stage.", new ClassType.Builder().name(stage.getNextStage().getName()).build());
        this.implementationReturnValue = new ReturnValue("", model.getImplementationType());

        this.parameters = parameters;

        this.implementationMethodTemplate = MethodTemplate.builder()
                .methodSignature(this.getImplementationMethodSignature())
                .method(block -> {
                    parameters.forEach(p -> block.line("this.%1$s = %2$s;", resourceLocalVariables.getLocalVariableByMethodParameter(p).getName(), p.getName()));
                    block.methodReturn("this");
                })
                .build();
    }

    @Override
    public String getBaseMethodSignature() {
        String parameterText = parameters.stream()
                .map(p -> String.format("%1$s %2$s", p.getClientType().toString(), p.getName()))
                .collect(Collectors.joining(", "));
        return String.format("%1$s(%2$s)",
                this.name, parameterText);
    }

    @Override
    public void writeJavadoc(JavaJavadocComment commentBlock) {
        commentBlock.description(description);
        parameters.forEach(p -> commentBlock.param(p.getName(), p.getDescription()));
        commentBlock.methodReturns(interfaceReturnValue.getDescription());
    }

    @Override
    public void addImportsTo(Set<String> imports, boolean includeImplementationImports) {
        parameters.forEach(p -> p.addImportsTo(imports, false));
    }
}

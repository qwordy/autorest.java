/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.immutablemodel;

import com.azure.autorest.fluent.model.clientmodel.FluentModelProperty;
import com.azure.autorest.fluent.model.clientmodel.ModelNaming;
import com.azure.autorest.fluent.model.clientmodel.ModelProperty;
import com.azure.autorest.fluent.util.TypeConversionUtils;
import com.azure.autorest.model.clientmodel.ListType;
import com.azure.autorest.model.clientmodel.MapType;
import com.azure.autorest.template.prototype.MethodTemplate;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Implementation method template for simple property
// E.g. "return this.inner().sku()"
public class PropertyTemplate implements ImmutableMethod {

    private final MethodTemplate implementationMethodTemplate;

    public PropertyTemplate(FluentModelProperty fluentProperty, ModelProperty property) {
        Set<String> imports = new HashSet<>();
        fluentProperty.getFluentType().addImportsTo(imports, false);
        if (property.getClientType() instanceof ListType || property.getClientType() instanceof MapType) {
            // Type inner = ...
            property.getClientType().addImportsTo(imports, false);

            // Collections.unmodifiableList
            imports.add(Collections.class.getName());
        }

        implementationMethodTemplate = MethodTemplate.builder()
                .imports(imports)
                .methodSignature(fluentProperty.getMethodSignature())
                .method(block -> {
                    if (property.getClientType() instanceof ListType || property.getClientType() instanceof MapType) {
                        block.line(String.format("%1$s %2$s = this.%3$s().%4$s();", property.getClientType().toString(), TypeConversionUtils.tempVariableName(), ModelNaming.METHOD_INNER_MODEL, property.getGetterName()));
                        block.ifBlock(String.format("%1$s != null", TypeConversionUtils.tempVariableName()), ifBlock -> {
                            block.methodReturn(TypeConversionUtils.objectOrUnmodifiableCollection(property.getClientType(), TypeConversionUtils.tempVariableName()));
                        }).elseBlock(elseBlock -> {
                            block.methodReturn(TypeConversionUtils.nullOrEmptyCollection(property.getClientType()));
                        });
                    } else {
                        block.methodReturn(String.format("this.%1$s().%2$s()", ModelNaming.METHOD_INNER_MODEL, property.getGetterName()));
                    }
                })
                .build();
    }

    @Override
    public MethodTemplate getMethodTemplate() {
        return implementationMethodTemplate;
    }
}

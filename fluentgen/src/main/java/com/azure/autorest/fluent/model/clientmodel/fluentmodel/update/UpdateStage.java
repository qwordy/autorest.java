/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.fluentmodel.update;

import com.azure.autorest.fluent.model.clientmodel.ModelProperty;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.FluentInterfaceStage;

public class UpdateStage extends FluentInterfaceStage {

    public UpdateStage(String name) {
        super(name);
    }

    protected UpdateStage(String name, ModelProperty property) {
        super(name, property);
    }

    public String getDescription(String modelName) {
        return property == null
                ? String.format("The stage of the %1$s update.", modelName)
                : String.format("The stage of the %1$s update allowing to specify %2$s.", modelName, property.getName());
    }

    public ModelProperty getModelProperty() {
        return this.property;
    }
}

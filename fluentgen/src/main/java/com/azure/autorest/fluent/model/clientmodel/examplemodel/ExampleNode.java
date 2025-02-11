/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.examplemodel;

import com.azure.autorest.model.clientmodel.IType;

import java.util.ArrayList;
import java.util.List;

/**
 * Tree of example nodes.
 */
public abstract class ExampleNode {

    // the full Object at and below this node
    private final Object objectValue;

    private final IType clientType;

    private final List<ExampleNode> childNodes = new ArrayList<>();

    public ExampleNode(IType clientType, Object objectValue) {
        this.clientType = clientType;
        this.objectValue = objectValue;
    }

    public List<ExampleNode> getChildNodes() {
        return childNodes;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public IType getClientType() {
        return clientType;
    }

    public boolean isNull() {
        return objectValue == null;
    }
}

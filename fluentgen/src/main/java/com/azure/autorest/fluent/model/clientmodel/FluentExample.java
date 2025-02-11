/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel;

import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentClientMethodExample;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentCollectionMethodExample;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentResourceCreateExample;
import com.azure.autorest.fluent.model.clientmodel.examplemodel.FluentResourceUpdateExample;

import java.util.ArrayList;
import java.util.List;

public class FluentExample implements Comparable<FluentExample> {

    private final String groupName;
    private final String methodName;

    private final List<FluentCollectionMethodExample> collectionMethodExamples = new ArrayList<>();
    private final List<FluentResourceCreateExample> resourceCreateExamples = new ArrayList<>();
    private final List<FluentResourceUpdateExample> resourceUpdateExamples = new ArrayList<>();

    private final List<FluentClientMethodExample> clientMethodExamples = new ArrayList<>();

    public FluentExample(String groupName, String methodName) {
        this.groupName = groupName;
        this.methodName = methodName;
    }

    public List<FluentCollectionMethodExample> getCollectionMethodExamples() {
        return collectionMethodExamples;
    }

    public List<FluentResourceCreateExample> getResourceCreateExamples() {
        return resourceCreateExamples;
    }

    public List<FluentResourceUpdateExample> getResourceUpdateExamples() {
        return resourceUpdateExamples;
    }

    public List<FluentClientMethodExample> getClientMethodExamples() {
        return clientMethodExamples;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getClassName() {
        return groupName + methodName + "Samples";
    }

    @Override
    public int compareTo(FluentExample o) {
        int ret = this.groupName.compareTo(o.groupName);
        if (ret == 0) {
            ret = this.methodName.compareTo(o.methodName);
        }
        return ret;
    }
}

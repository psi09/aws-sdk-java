/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceStatus {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_FAILED("CREATE_FAILED"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETE_FAILED("DELETE_FAILED"),
    DELETE_COMPLETE("DELETE_COMPLETE"),
    DELETE_SKIPPED("DELETE_SKIPPED"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    UPDATE_FAILED("UPDATE_FAILED"),
    UPDATE_COMPLETE("UPDATE_COMPLETE");

    private String value;

    private ResourceStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ResourceStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceStatus enumEntry : ResourceStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

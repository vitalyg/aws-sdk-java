/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     */
    private Boolean autoEnable;
    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator master account.
     * </p>
     */
    private Boolean memberAccountLimitReached;

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * 
     * @return Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * 
     * @return Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator master account.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *        administrator master account.
     */

    public void setMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        this.memberAccountLimitReached = memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator master account.
     * </p>
     * 
     * @return Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *         administrator master account.
     */

    public Boolean getMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator master account.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *        administrator master account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        setMemberAccountLimitReached(memberAccountLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator master account.
     * </p>
     * 
     * @return Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *         administrator master account.
     */

    public Boolean isMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getMemberAccountLimitReached() != null)
            sb.append("MemberAccountLimitReached: ").append(getMemberAccountLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationConfigurationResult == false)
            return false;
        DescribeOrganizationConfigurationResult other = (DescribeOrganizationConfigurationResult) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getMemberAccountLimitReached() == null ^ this.getMemberAccountLimitReached() == null)
            return false;
        if (other.getMemberAccountLimitReached() != null && other.getMemberAccountLimitReached().equals(this.getMemberAccountLimitReached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountLimitReached() == null) ? 0 : getMemberAccountLimitReached().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigurationResult clone() {
        try {
            return (DescribeOrganizationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

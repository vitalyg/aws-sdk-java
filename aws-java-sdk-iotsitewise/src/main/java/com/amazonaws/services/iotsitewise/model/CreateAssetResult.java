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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS
     * IoT SiteWise APIs.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     */
    private String assetArn;
    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     */
    private AssetStatus assetStatus;

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS
     * IoT SiteWise APIs.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with
     *        other AWS IoT SiteWise APIs.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS
     * IoT SiteWise APIs.
     * </p>
     * 
     * @return The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with
     *         other AWS IoT SiteWise APIs.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS
     * IoT SiteWise APIs.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with
     *        other AWS IoT SiteWise APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetResult withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @param assetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     */

    public void setAssetArn(String assetArn) {
        this.assetArn = assetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         asset, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     */

    public String getAssetArn() {
        return this.assetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @param assetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetResult withAssetArn(String assetArn) {
        setAssetArn(assetArn);
        return this;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @param assetStatus
     *        The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this
     *        action) and any error message.
     */

    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @return The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this
     *         action) and any error message.
     */

    public AssetStatus getAssetStatus() {
        return this.assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @param assetStatus
     *        The status of the asset, which contains a state (<code>CREATING</code> after successfully calling this
     *        action) and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetResult withAssetStatus(AssetStatus assetStatus) {
        setAssetStatus(assetStatus);
        return this;
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetArn() != null)
            sb.append("AssetArn: ").append(getAssetArn()).append(",");
        if (getAssetStatus() != null)
            sb.append("AssetStatus: ").append(getAssetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetResult == false)
            return false;
        CreateAssetResult other = (CreateAssetResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetArn() == null ^ this.getAssetArn() == null)
            return false;
        if (other.getAssetArn() != null && other.getAssetArn().equals(this.getAssetArn()) == false)
            return false;
        if (other.getAssetStatus() == null ^ this.getAssetStatus() == null)
            return false;
        if (other.getAssetStatus() != null && other.getAssetStatus().equals(this.getAssetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetArn() == null) ? 0 : getAssetArn().hashCode());
        hashCode = prime * hashCode + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetResult clone() {
        try {
            return (CreateAssetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

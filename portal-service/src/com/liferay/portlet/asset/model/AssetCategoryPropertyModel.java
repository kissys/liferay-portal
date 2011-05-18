/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.asset.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetCategoryProperty service. Represents a row in the &quot;AssetCategoryProperty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.asset.model.impl.AssetCategoryPropertyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.asset.model.impl.AssetCategoryPropertyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryProperty
 * @see com.liferay.portlet.asset.model.impl.AssetCategoryPropertyImpl
 * @see com.liferay.portlet.asset.model.impl.AssetCategoryPropertyModelImpl
 * @generated
 */
public interface AssetCategoryPropertyModel extends AuditedModel,
	BaseModel<AssetCategoryProperty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset category property model instance should use the {@link AssetCategoryProperty} interface instead.
	 */

	/**
	 * Gets the primary key of this asset category property.
	 *
	 * @return the primary key of this asset category property
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset category property
	 *
	 * @param primaryKey the primary key of this asset category property
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the category property ID of this asset category property.
	 *
	 * @return the category property ID of this asset category property
	 */
	public long getCategoryPropertyId();

	/**
	 * Sets the category property ID of this asset category property.
	 *
	 * @param categoryPropertyId the category property ID of this asset category property
	 */
	public void setCategoryPropertyId(long categoryPropertyId);

	/**
	 * Gets the company ID of this asset category property.
	 *
	 * @return the company ID of this asset category property
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset category property.
	 *
	 * @param companyId the company ID of this asset category property
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this asset category property.
	 *
	 * @return the user ID of this asset category property
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this asset category property.
	 *
	 * @param userId the user ID of this asset category property
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this asset category property.
	 *
	 * @return the user uuid of this asset category property
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this asset category property.
	 *
	 * @param userUuid the user uuid of this asset category property
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this asset category property.
	 *
	 * @return the user name of this asset category property
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this asset category property.
	 *
	 * @param userName the user name of this asset category property
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this asset category property.
	 *
	 * @return the create date of this asset category property
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset category property.
	 *
	 * @param createDate the create date of this asset category property
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this asset category property.
	 *
	 * @return the modified date of this asset category property
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset category property.
	 *
	 * @param modifiedDate the modified date of this asset category property
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the category ID of this asset category property.
	 *
	 * @return the category ID of this asset category property
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this asset category property.
	 *
	 * @param categoryId the category ID of this asset category property
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Gets the key of this asset category property.
	 *
	 * @return the key of this asset category property
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this asset category property.
	 *
	 * @param key the key of this asset category property
	 */
	public void setKey(String key);

	/**
	 * Gets the value of this asset category property.
	 *
	 * @return the value of this asset category property
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this asset category property.
	 *
	 * @param value the value of this asset category property
	 */
	public void setValue(String value);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(AssetCategoryProperty assetCategoryProperty);

	public int hashCode();

	public AssetCategoryProperty toEscapedModel();

	public String toString();

	public String toXmlString();
}
/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.testing.model;

/**
 * A description of an iOS device tests may be run on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IosModel extends com.google.api.client.json.GenericJson {

  /**
   * Device capabilities. Copied from https://developer.apple.com/library/archive/documentation/Devi
   * ceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMat
   * rix.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deviceCapabilities;

  /**
   * Whether this device is a phone, tablet, wearable, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formFactor;

  /**
   * The unique opaque id for this model. Use this for invoking the TestExecutionService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The human-readable name for this device model. Examples: "iPhone 4s", "iPad Mini 2".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Screen density in DPI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenDensity;

  /**
   * Screen size in the horizontal (X) dimension measured in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenX;

  /**
   * Screen size in the vertical (Y) dimension measured in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenY;

  /**
   * The set of iOS major software versions this device supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedVersionIds;

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Device capabilities. Copied from https://developer.apple.com/library/archive/documentation/Devi
   * ceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMat
   * rix.html
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeviceCapabilities() {
    return deviceCapabilities;
  }

  /**
   * Device capabilities. Copied from https://developer.apple.com/library/archive/documentation/Devi
   * ceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMat
   * rix.html
   * @param deviceCapabilities deviceCapabilities or {@code null} for none
   */
  public IosModel setDeviceCapabilities(java.util.List<java.lang.String> deviceCapabilities) {
    this.deviceCapabilities = deviceCapabilities;
    return this;
  }

  /**
   * Whether this device is a phone, tablet, wearable, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormFactor() {
    return formFactor;
  }

  /**
   * Whether this device is a phone, tablet, wearable, etc.
   * @param formFactor formFactor or {@code null} for none
   */
  public IosModel setFormFactor(java.lang.String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

  /**
   * The unique opaque id for this model. Use this for invoking the TestExecutionService.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique opaque id for this model. Use this for invoking the TestExecutionService.
   * @param id id or {@code null} for none
   */
  public IosModel setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The human-readable name for this device model. Examples: "iPhone 4s", "iPad Mini 2".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The human-readable name for this device model. Examples: "iPhone 4s", "iPad Mini 2".
   * @param name name or {@code null} for none
   */
  public IosModel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen density in DPI.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenDensity() {
    return screenDensity;
  }

  /**
   * Screen density in DPI.
   * @param screenDensity screenDensity or {@code null} for none
   */
  public IosModel setScreenDensity(java.lang.Integer screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }

  /**
   * Screen size in the horizontal (X) dimension measured in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenX() {
    return screenX;
  }

  /**
   * Screen size in the horizontal (X) dimension measured in pixels.
   * @param screenX screenX or {@code null} for none
   */
  public IosModel setScreenX(java.lang.Integer screenX) {
    this.screenX = screenX;
    return this;
  }

  /**
   * Screen size in the vertical (Y) dimension measured in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenY() {
    return screenY;
  }

  /**
   * Screen size in the vertical (Y) dimension measured in pixels.
   * @param screenY screenY or {@code null} for none
   */
  public IosModel setScreenY(java.lang.Integer screenY) {
    this.screenY = screenY;
    return this;
  }

  /**
   * The set of iOS major software versions this device supports.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedVersionIds() {
    return supportedVersionIds;
  }

  /**
   * The set of iOS major software versions this device supports.
   * @param supportedVersionIds supportedVersionIds or {@code null} for none
   */
  public IosModel setSupportedVersionIds(java.util.List<java.lang.String> supportedVersionIds) {
    this.supportedVersionIds = supportedVersionIds;
    return this;
  }

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated".
   * @param tags tags or {@code null} for none
   */
  public IosModel setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public IosModel set(String fieldName, Object value) {
    return (IosModel) super.set(fieldName, value);
  }

  @Override
  public IosModel clone() {
    return (IosModel) super.clone();
  }

}
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package platform;

public class item_info {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected item_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(item_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PlatformModuleJNI.delete_item_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setItem_name(String value) {
    PlatformModuleJNI.item_info_item_name_set(swigCPtr, this, value);
  }

  public String getItem_name() {
    return PlatformModuleJNI.item_info_item_name_get(swigCPtr, this);
  }

  public void setConsumable(boolean value) {
    PlatformModuleJNI.item_info_consumable_set(swigCPtr, this, value);
  }

  public boolean getConsumable() {
    return PlatformModuleJNI.item_info_consumable_get(swigCPtr, this);
  }

  public item_info() {
    this(PlatformModuleJNI.new_item_info__SWIG_0(), true);
  }

  public item_info(item_info other) {
    this(PlatformModuleJNI.new_item_info__SWIG_1(item_info.getCPtr(other), other), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class FullName {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FullName(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FullName obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(FullName obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        exampleJNI.delete_FullName(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirst_name(String value) {
    exampleJNI.FullName_first_name_set(swigCPtr, this, value);
  }

  public String getFirst_name() {
    return exampleJNI.FullName_first_name_get(swigCPtr, this);
  }

  public void setLast_name(String value) {
    exampleJNI.FullName_last_name_set(swigCPtr, this, value);
  }

  public String getLast_name() {
    return exampleJNI.FullName_last_name_get(swigCPtr, this);
  }

  public FullName(String fn, String ln) {
    this(exampleJNI.new_FullName(fn, ln), true);
  }

}

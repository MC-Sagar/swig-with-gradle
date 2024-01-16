/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class FullNameVector extends java.util.AbstractList<FullName> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FullNameVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FullNameVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(FullNameVector obj) {
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
        exampleJNI.delete_FullNameVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FullNameVector(FullName[] initialElements) {
    this();
    reserve(initialElements.length);

    for (FullName element : initialElements) {
      add(element);
    }
  }

  public FullNameVector(Iterable<FullName> initialElements) {
    this();
    for (FullName element : initialElements) {
      add(element);
    }
  }

  public FullName get(int index) {
    return doGet(index);
  }

  public FullName set(int index, FullName e) {
    return doSet(index, e);
  }

  public boolean add(FullName e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, FullName e) {
    modCount++;
    doAdd(index, e);
  }

  public FullName remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public int capacity() {
    return doCapacity();
  }

  public void reserve(int n) {
    doReserve(n);
  }

  public FullNameVector() {
    this(exampleJNI.new_FullNameVector__SWIG_0(), true);
  }

  public FullNameVector(FullNameVector other) {
    this(exampleJNI.new_FullNameVector__SWIG_1(FullNameVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return exampleJNI.FullNameVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    exampleJNI.FullNameVector_clear(swigCPtr, this);
  }

  public FullNameVector(int count, FullName value) {
    this(exampleJNI.new_FullNameVector__SWIG_2(count, FullName.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return exampleJNI.FullNameVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    exampleJNI.FullNameVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return exampleJNI.FullNameVector_doSize(swigCPtr, this);
  }

  private void doAdd(FullName x) {
    exampleJNI.FullNameVector_doAdd__SWIG_0(swigCPtr, this, FullName.getCPtr(x), x);
  }

  private void doAdd(int index, FullName x) {
    exampleJNI.FullNameVector_doAdd__SWIG_1(swigCPtr, this, index, FullName.getCPtr(x), x);
  }

  private FullName doRemove(int index) {
    return new FullName(exampleJNI.FullNameVector_doRemove(swigCPtr, this, index), true);
  }

  private FullName doGet(int index) {
    return new FullName(exampleJNI.FullNameVector_doGet(swigCPtr, this, index), false);
  }

  private FullName doSet(int index, FullName val) {
    return new FullName(exampleJNI.FullNameVector_doSet(swigCPtr, this, index, FullName.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    exampleJNI.FullNameVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
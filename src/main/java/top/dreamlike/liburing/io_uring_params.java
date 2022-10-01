// Generated by jextract

package top.dreamlike.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class io_uring_params {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("sq_entries"),
        Constants$root.C_INT$LAYOUT.withName("cq_entries"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("sq_thread_cpu"),
        Constants$root.C_INT$LAYOUT.withName("sq_thread_idle"),
        Constants$root.C_INT$LAYOUT.withName("features"),
        Constants$root.C_INT$LAYOUT.withName("wq_fd"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_INT$LAYOUT).withName("resv"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("head"),
            Constants$root.C_INT$LAYOUT.withName("tail"),
            Constants$root.C_INT$LAYOUT.withName("ring_mask"),
            Constants$root.C_INT$LAYOUT.withName("ring_entries"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            Constants$root.C_INT$LAYOUT.withName("dropped"),
            Constants$root.C_INT$LAYOUT.withName("array"),
            Constants$root.C_INT$LAYOUT.withName("resv1"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("resv2")
        ).withName("sq_off"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("head"),
            Constants$root.C_INT$LAYOUT.withName("tail"),
            Constants$root.C_INT$LAYOUT.withName("ring_mask"),
            Constants$root.C_INT$LAYOUT.withName("ring_entries"),
            Constants$root.C_INT$LAYOUT.withName("overflow"),
            Constants$root.C_INT$LAYOUT.withName("cqes"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            Constants$root.C_INT$LAYOUT.withName("resv1"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("resv2")
        ).withName("cq_off")
    ).withName("io_uring_params");
    public static MemoryLayout $LAYOUT() {
        return io_uring_params.$struct$LAYOUT;
    }
    static final VarHandle sq_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_entries"));
    public static VarHandle sq_entries$VH() {
        return io_uring_params.sq_entries$VH;
    }
    public static int sq_entries$get(MemorySegment seg) {
        return (int)io_uring_params.sq_entries$VH.get(seg);
    }
    public static void sq_entries$set( MemorySegment seg, int x) {
        io_uring_params.sq_entries$VH.set(seg, x);
    }
    public static int sq_entries$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_entries$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cq_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cq_entries"));
    public static VarHandle cq_entries$VH() {
        return io_uring_params.cq_entries$VH;
    }
    public static int cq_entries$get(MemorySegment seg) {
        return (int)io_uring_params.cq_entries$VH.get(seg);
    }
    public static void cq_entries$set( MemorySegment seg, int x) {
        io_uring_params.cq_entries$VH.set(seg, x);
    }
    public static int cq_entries$get(MemorySegment seg, long index) {
        return (int)io_uring_params.cq_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cq_entries$set(MemorySegment seg, long index, int x) {
        io_uring_params.cq_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return io_uring_params.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)io_uring_params.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        io_uring_params.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)io_uring_params.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        io_uring_params.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sq_thread_cpu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_thread_cpu"));
    public static VarHandle sq_thread_cpu$VH() {
        return io_uring_params.sq_thread_cpu$VH;
    }
    public static int sq_thread_cpu$get(MemorySegment seg) {
        return (int)io_uring_params.sq_thread_cpu$VH.get(seg);
    }
    public static void sq_thread_cpu$set( MemorySegment seg, int x) {
        io_uring_params.sq_thread_cpu$VH.set(seg, x);
    }
    public static int sq_thread_cpu$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_thread_cpu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_thread_cpu$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_thread_cpu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sq_thread_idle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_thread_idle"));
    public static VarHandle sq_thread_idle$VH() {
        return io_uring_params.sq_thread_idle$VH;
    }
    public static int sq_thread_idle$get(MemorySegment seg) {
        return (int)io_uring_params.sq_thread_idle$VH.get(seg);
    }
    public static void sq_thread_idle$set( MemorySegment seg, int x) {
        io_uring_params.sq_thread_idle$VH.set(seg, x);
    }
    public static int sq_thread_idle$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_thread_idle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_thread_idle$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_thread_idle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle features$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("features"));
    public static VarHandle features$VH() {
        return io_uring_params.features$VH;
    }
    public static int features$get(MemorySegment seg) {
        return (int)io_uring_params.features$VH.get(seg);
    }
    public static void features$set( MemorySegment seg, int x) {
        io_uring_params.features$VH.set(seg, x);
    }
    public static int features$get(MemorySegment seg, long index) {
        return (int)io_uring_params.features$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void features$set(MemorySegment seg, long index, int x) {
        io_uring_params.features$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wq_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wq_fd"));
    public static VarHandle wq_fd$VH() {
        return io_uring_params.wq_fd$VH;
    }
    public static int wq_fd$get(MemorySegment seg) {
        return (int)io_uring_params.wq_fd$VH.get(seg);
    }
    public static void wq_fd$set( MemorySegment seg, int x) {
        io_uring_params.wq_fd$VH.set(seg, x);
    }
    public static int wq_fd$get(MemorySegment seg, long index) {
        return (int)io_uring_params.wq_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wq_fd$set(MemorySegment seg, long index, int x) {
        io_uring_params.wq_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment resv$slice(MemorySegment seg) {
        return seg.asSlice(28, 12);
    }
    public static MemorySegment sq_off$slice(MemorySegment seg) {
        return seg.asSlice(40, 40);
    }
    public static MemorySegment cq_off$slice(MemorySegment seg) {
        return seg.asSlice(80, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



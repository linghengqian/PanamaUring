// Generated by jextract

package top.dreamlike.nativeLib.in;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

public class pthread_cond_t {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("__wseq"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("__low"),
                    Constants$root.C_INT$LAYOUT.withName("__high")
                ).withName("__wseq32")
            ).withName("$anon$0"),
            MemoryLayout.unionLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("__g1_start"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("__low"),
                    Constants$root.C_INT$LAYOUT.withName("__high")
                ).withName("__g1_start32")
            ).withName("$anon$1"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_refs"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_size"),
            Constants$root.C_INT$LAYOUT.withName("__g1_orig_size"),
            Constants$root.C_INT$LAYOUT.withName("__wrefs"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_signals")
        ).withName("__data"),
        MemoryLayout.sequenceLayout(48, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
    );
    public static MemoryLayout $LAYOUT() {
        return pthread_cond_t.$union$LAYOUT;
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_cond_t.__align$VH;
    }
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_cond_t.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, long x) {
        pthread_cond_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_cond_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_cond_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



// Generated by jextract

package top.dreamlike.nativeLib.inet;

import top.dreamlike.common.CType;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class group_filter {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("gf_interface"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.structLayout(
                    CType.C_SHORT$LAYOUT.withName("ss_family"),
                    MemoryLayout.sequenceLayout(118, CType.C_CHAR$LAYOUT).withName("__ss_padding"),
                    CType.C_LONG_LONG$LAYOUT.withName("__ss_align")
            ).withName("gf_group"),
            CType.C_INT$LAYOUT.withName("gf_fmode"),
            CType.C_INT$LAYOUT.withName("gf_numsrc"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                    CType.C_SHORT$LAYOUT.withName("ss_family"),
                    MemoryLayout.sequenceLayout(118, CType.C_CHAR$LAYOUT).withName("__ss_padding"),
                    CType.C_LONG_LONG$LAYOUT.withName("__ss_align")
            ).withName("sockaddr_storage")).withName("gf_slist")
    ).withName("group_filter");

    public static MemoryLayout $LAYOUT() {
        return group_filter.$struct$LAYOUT;
    }
    static final VarHandle gf_interface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gf_interface"));
    public static VarHandle gf_interface$VH() {
        return group_filter.gf_interface$VH;
    }
    public static int gf_interface$get(MemorySegment seg) {
        return (int)group_filter.gf_interface$VH.get(seg);
    }
    public static void gf_interface$set( MemorySegment seg, int x) {
        group_filter.gf_interface$VH.set(seg, x);
    }
    public static int gf_interface$get(MemorySegment seg, long index) {
        return (int)group_filter.gf_interface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gf_interface$set(MemorySegment seg, long index, int x) {
        group_filter.gf_interface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment gf_group$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle gf_fmode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gf_fmode"));
    public static VarHandle gf_fmode$VH() {
        return group_filter.gf_fmode$VH;
    }
    public static int gf_fmode$get(MemorySegment seg) {
        return (int)group_filter.gf_fmode$VH.get(seg);
    }
    public static void gf_fmode$set( MemorySegment seg, int x) {
        group_filter.gf_fmode$VH.set(seg, x);
    }
    public static int gf_fmode$get(MemorySegment seg, long index) {
        return (int)group_filter.gf_fmode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gf_fmode$set(MemorySegment seg, long index, int x) {
        group_filter.gf_fmode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gf_numsrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gf_numsrc"));
    public static VarHandle gf_numsrc$VH() {
        return group_filter.gf_numsrc$VH;
    }
    public static int gf_numsrc$get(MemorySegment seg) {
        return (int)group_filter.gf_numsrc$VH.get(seg);
    }
    public static void gf_numsrc$set( MemorySegment seg, int x) {
        group_filter.gf_numsrc$VH.set(seg, x);
    }
    public static int gf_numsrc$get(MemorySegment seg, long index) {
        return (int)group_filter.gf_numsrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gf_numsrc$set(MemorySegment seg, long index, int x) {
        group_filter.gf_numsrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment gf_slist$slice(MemorySegment seg) {
        return seg.asSlice(144, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}



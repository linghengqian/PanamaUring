// Generated by jextract

package top.dreamlike.nativeLib.socket;

import java.lang.foreign.*;

public class __kernel_fsid_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("val")
    );
    public static MemoryLayout $LAYOUT() {
        return __kernel_fsid_t.$struct$LAYOUT;
    }
    public static MemorySegment val$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



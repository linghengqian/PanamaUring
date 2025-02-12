// Generated by jextract

package top.dreamlike.nativeLib.inotify;

import top.dreamlike.common.CType;
import top.dreamlike.helper.NativeHelper;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class inotify_event {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("wd"),
            CType.C_INT$LAYOUT.withName("mask"),
            CType.C_INT$LAYOUT.withName("cookie"),
            CType.C_INT$LAYOUT.withName("len"),
            MemoryLayout.sequenceLayout(0, CType.C_CHAR$LAYOUT).withName("name")
    ).withName("inotify_event");

    public static MemoryLayout $LAYOUT() {
        return inotify_event.$struct$LAYOUT;
    }

    static final VarHandle wd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wd"));

    //static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static String name$get(MemorySegment seg) {
        int len = len$get(seg);
        if (len == 0) {
            return "";
        }
        MemorySegment segment = seg.asSlice(16);
        return NativeHelper.toString(segment);
    }


    public static VarHandle wd$VH() {
        return inotify_event.wd$VH;
    }

    public static int wd$get(MemorySegment seg) {
        return (int) inotify_event.wd$VH.get(seg);
    }

    public static void wd$set(MemorySegment seg, int x) {
        inotify_event.wd$VH.set(seg, x);
    }

    public static int wd$get(MemorySegment seg, long index) {
        return (int) inotify_event.wd$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void wd$set(MemorySegment seg, long index, int x) {
        inotify_event.wd$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mask"));

    public static VarHandle mask$VH() {
        return inotify_event.mask$VH;
    }

    public static int mask$get(MemorySegment seg) {
        return (int) inotify_event.mask$VH.get(seg);
    }

    public static void mask$set(MemorySegment seg, int x) {
        inotify_event.mask$VH.set(seg, x);
    }

    public static int mask$get(MemorySegment seg, long index) {
        return (int) inotify_event.mask$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void mask$set(MemorySegment seg, long index, int x) {
        inotify_event.mask$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle cookie$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cookie"));

    public static VarHandle cookie$VH() {
        return inotify_event.cookie$VH;
    }

    public static int cookie$get(MemorySegment seg) {
        return (int) inotify_event.cookie$VH.get(seg);
    }

    public static void cookie$set(MemorySegment seg, int x) {
        inotify_event.cookie$VH.set(seg, x);
    }

    public static int cookie$get(MemorySegment seg, long index) {
        return (int) inotify_event.cookie$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void cookie$set(MemorySegment seg, long index, int x) {
        inotify_event.cookie$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));

    public static VarHandle len$VH() {
        return inotify_event.len$VH;
    }

    public static int len$get(MemorySegment seg) {
        return (int) inotify_event.len$VH.get(seg);
    }

    public static void len$set(MemorySegment seg, int x) {
        inotify_event.len$VH.set(seg, x);
    }

    public static int len$get(MemorySegment seg, long index) {
        return (int) inotify_event.len$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void len$set(MemorySegment seg, long index, int x) {
        inotify_event.len$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}

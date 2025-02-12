// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class io_uring_sqe {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            CType.C_CHAR$LAYOUT.withName("opcode"),
            CType.C_CHAR$LAYOUT.withName("flags"),
            CType.C_SHORT$LAYOUT.withName("ioprio"),
            CType.C_INT$LAYOUT.withName("res"),
            MemoryLayout.unionLayout(
                    CType.C_LONG_LONG$LAYOUT.withName("off"),
                    CType.C_LONG_LONG$LAYOUT.withName("addr2")
            ).withName("$anon$0"),
            MemoryLayout.unionLayout(
                    CType.C_LONG_LONG$LAYOUT.withName("addr"),
                    CType.C_LONG_LONG$LAYOUT.withName("splice_off_in")
            ).withName("$anon$1"),
            CType.C_INT$LAYOUT.withName("len"),
            MemoryLayout.unionLayout(
            CType.C_INT$LAYOUT.withName("rw_flags"),
            CType.C_INT$LAYOUT.withName("fsync_flags"),
            CType.C_SHORT$LAYOUT.withName("poll_events"),
            CType.C_INT$LAYOUT.withName("poll32_events"),
            CType.C_INT$LAYOUT.withName("sync_range_flags"),
            CType.C_INT$LAYOUT.withName("msg_flags"),
            CType.C_INT$LAYOUT.withName("timeout_flags"),
            CType.C_INT$LAYOUT.withName("accept_flags"),
            CType.C_INT$LAYOUT.withName("cancel_flags"),
            CType.C_INT$LAYOUT.withName("open_flags"),
            CType.C_INT$LAYOUT.withName("statx_flags"),
            CType.C_INT$LAYOUT.withName("fadvise_advice"),
            CType.C_INT$LAYOUT.withName("splice_flags"),
            CType.C_INT$LAYOUT.withName("rename_flags"),
            CType.C_INT$LAYOUT.withName("unlink_flags")
        ).withName("$anon$2"),
        CType.C_LONG_LONG$LAYOUT.withName("user_data"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    CType.C_SHORT$LAYOUT.withName("buf_index"),
                    CType.C_SHORT$LAYOUT.withName("buf_group")
                ).withName("$anon$0"),
                CType.C_SHORT$LAYOUT.withName("personality"),
                CType.C_INT$LAYOUT.withName("splice_fd_in")
            ).withName("$anon$0"),
            MemoryLayout.sequenceLayout(3, CType.C_LONG_LONG$LAYOUT).withName("__pad2")
        ).withName("$anon$3")
    ).withName("io_uring_sqe");
    public static MemoryLayout $LAYOUT() {
        return io_uring_sqe.$struct$LAYOUT;
    }
    static final VarHandle opcode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("opcode"));
    public static VarHandle opcode$VH() {
        return io_uring_sqe.opcode$VH;
    }
    public static byte opcode$get(MemorySegment seg) {
        return (byte)io_uring_sqe.opcode$VH.get(seg);
    }
    public static void opcode$set( MemorySegment seg, byte x) {
        io_uring_sqe.opcode$VH.set(seg, x);
    }
    public static byte opcode$get(MemorySegment seg, long index) {
        return (byte)io_uring_sqe.opcode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void opcode$set(MemorySegment seg, long index, byte x) {
        io_uring_sqe.opcode$VH.set(seg.asSlice(index*sizeof()), x);
    }

    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));

    public static VarHandle flags$VH() {
        return io_uring_sqe.flags$VH;
    }

    public static byte flags$get(MemorySegment seg) {
        return (byte) io_uring_sqe.flags$VH.get(seg);
    }

    public static void flags$set(MemorySegment seg, byte x) {
        io_uring_sqe.flags$VH.set(seg, x);
    }

    public static void flags$and(MemorySegment seg, byte x) {
        io_uring_sqe.flags$set(seg, ((byte) (io_uring_sqe.flags$get(seg) | x)));
    }

    public static byte flags$get(MemorySegment seg, long index) {
        return (byte) io_uring_sqe.flags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void flags$set(MemorySegment seg, long index, byte x) {
        io_uring_sqe.flags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ioprio$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ioprio"));

    public static VarHandle ioprio$VH() {
        return io_uring_sqe.ioprio$VH;
    }
    public static short ioprio$get(MemorySegment seg) {
        return (short)io_uring_sqe.ioprio$VH.get(seg);
    }
    public static void ioprio$set( MemorySegment seg, short x) {
        io_uring_sqe.ioprio$VH.set(seg, x);
    }
    public static short ioprio$get(MemorySegment seg, long index) {
        return (short)io_uring_sqe.ioprio$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ioprio$set(MemorySegment seg, long index, short x) {
        io_uring_sqe.ioprio$VH.set(seg.asSlice(index*sizeof()), x);
    }

    static final VarHandle fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("res"));
    public static VarHandle fd$VH() {
        return io_uring_sqe.fd$VH;
    }
    public static int fd$get(MemorySegment seg) {
        return (int)io_uring_sqe.fd$VH.get(seg);
    }
    public static void fd$set( MemorySegment seg, int x) {
        io_uring_sqe.fd$VH.set(seg, x);
    }
    public static int fd$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fd$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle off$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("off"));
    public static VarHandle off$VH() {
        return io_uring_sqe.off$VH;
    }
    public static long off$get(MemorySegment seg) {
        return (long)io_uring_sqe.off$VH.get(seg);
    }
    public static void off$set( MemorySegment seg, long x) {
        io_uring_sqe.off$VH.set(seg, x);
    }
    public static long off$get(MemorySegment seg, long index) {
        return (long)io_uring_sqe.off$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void off$set(MemorySegment seg, long index, long x) {
        io_uring_sqe.off$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle addr2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("addr2"));
    public static VarHandle addr2$VH() {
        return io_uring_sqe.addr2$VH;
    }
    public static long addr2$get(MemorySegment seg) {
        return (long)io_uring_sqe.addr2$VH.get(seg);
    }
    public static void addr2$set( MemorySegment seg, long x) {
        io_uring_sqe.addr2$VH.set(seg, x);
    }
    public static long addr2$get(MemorySegment seg, long index) {
        return (long)io_uring_sqe.addr2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void addr2$set(MemorySegment seg, long index, long x) {
        io_uring_sqe.addr2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle addr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("addr"));
    public static VarHandle addr$VH() {
        return io_uring_sqe.addr$VH;
    }
    public static long addr$get(MemorySegment seg) {
        return (long)io_uring_sqe.addr$VH.get(seg);
    }
    public static void addr$set( MemorySegment seg, long x) {
        io_uring_sqe.addr$VH.set(seg, x);
    }
    public static long addr$get(MemorySegment seg, long index) {
        return (long)io_uring_sqe.addr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void addr$set(MemorySegment seg, long index, long x) {
        io_uring_sqe.addr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle splice_off_in$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("splice_off_in"));
    public static VarHandle splice_off_in$VH() {
        return io_uring_sqe.splice_off_in$VH;
    }
    public static long splice_off_in$get(MemorySegment seg) {
        return (long)io_uring_sqe.splice_off_in$VH.get(seg);
    }
    public static void splice_off_in$set( MemorySegment seg, long x) {
        io_uring_sqe.splice_off_in$VH.set(seg, x);
    }
    public static long splice_off_in$get(MemorySegment seg, long index) {
        return (long)io_uring_sqe.splice_off_in$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void splice_off_in$set(MemorySegment seg, long index, long x) {
        io_uring_sqe.splice_off_in$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static VarHandle len$VH() {
        return io_uring_sqe.len$VH;
    }
    public static int len$get(MemorySegment seg) {
        return (int)io_uring_sqe.len$VH.get(seg);
    }
    public static void len$set( MemorySegment seg, int x) {
        io_uring_sqe.len$VH.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rw_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("rw_flags"));
    public static VarHandle rw_flags$VH() {
        return io_uring_sqe.rw_flags$VH;
    }
    public static int rw_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.rw_flags$VH.get(seg);
    }
    public static void rw_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.rw_flags$VH.set(seg, x);
    }
    public static int rw_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.rw_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rw_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.rw_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fsync_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("fsync_flags"));
    public static VarHandle fsync_flags$VH() {
        return io_uring_sqe.fsync_flags$VH;
    }
    public static int fsync_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.fsync_flags$VH.get(seg);
    }
    public static void fsync_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.fsync_flags$VH.set(seg, x);
    }
    public static int fsync_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.fsync_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fsync_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.fsync_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle poll_events$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("poll_events"));
    public static VarHandle poll_events$VH() {
        return io_uring_sqe.poll_events$VH;
    }
    public static short poll_events$get(MemorySegment seg) {
        return (short)io_uring_sqe.poll_events$VH.get(seg);
    }
    public static void poll_events$set( MemorySegment seg, short x) {
        io_uring_sqe.poll_events$VH.set(seg, x);
    }
    public static short poll_events$get(MemorySegment seg, long index) {
        return (short)io_uring_sqe.poll_events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void poll_events$set(MemorySegment seg, long index, short x) {
        io_uring_sqe.poll_events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle poll32_events$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("poll32_events"));
    public static VarHandle poll32_events$VH() {
        return io_uring_sqe.poll32_events$VH;
    }
    public static int poll32_events$get(MemorySegment seg) {
        return (int)io_uring_sqe.poll32_events$VH.get(seg);
    }
    public static void poll32_events$set( MemorySegment seg, int x) {
        io_uring_sqe.poll32_events$VH.set(seg, x);
    }
    public static int poll32_events$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.poll32_events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void poll32_events$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.poll32_events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sync_range_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("sync_range_flags"));
    public static VarHandle sync_range_flags$VH() {
        return io_uring_sqe.sync_range_flags$VH;
    }
    public static int sync_range_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.sync_range_flags$VH.get(seg);
    }
    public static void sync_range_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.sync_range_flags$VH.set(seg, x);
    }
    public static int sync_range_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.sync_range_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sync_range_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.sync_range_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle msg_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("msg_flags"));
    public static VarHandle msg_flags$VH() {
        return io_uring_sqe.msg_flags$VH;
    }
    public static int msg_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.msg_flags$VH.get(seg);
    }
    public static void msg_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.msg_flags$VH.set(seg, x);
    }
    public static int msg_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.msg_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void msg_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.msg_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle timeout_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("timeout_flags"));
    public static VarHandle timeout_flags$VH() {
        return io_uring_sqe.timeout_flags$VH;
    }
    public static int timeout_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.timeout_flags$VH.get(seg);
    }
    public static void timeout_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.timeout_flags$VH.set(seg, x);
    }
    public static int timeout_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.timeout_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void timeout_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.timeout_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle accept_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("accept_flags"));
    public static VarHandle accept_flags$VH() {
        return io_uring_sqe.accept_flags$VH;
    }
    public static int accept_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.accept_flags$VH.get(seg);
    }
    public static void accept_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.accept_flags$VH.set(seg, x);
    }
    public static int accept_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.accept_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void accept_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.accept_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cancel_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("cancel_flags"));
    public static VarHandle cancel_flags$VH() {
        return io_uring_sqe.cancel_flags$VH;
    }
    public static int cancel_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.cancel_flags$VH.get(seg);
    }
    public static void cancel_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.cancel_flags$VH.set(seg, x);
    }
    public static int cancel_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.cancel_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cancel_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.cancel_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle open_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("open_flags"));
    public static VarHandle open_flags$VH() {
        return io_uring_sqe.open_flags$VH;
    }
    public static int open_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.open_flags$VH.get(seg);
    }
    public static void open_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.open_flags$VH.set(seg, x);
    }
    public static int open_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.open_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void open_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.open_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle statx_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("statx_flags"));
    public static VarHandle statx_flags$VH() {
        return io_uring_sqe.statx_flags$VH;
    }
    public static int statx_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.statx_flags$VH.get(seg);
    }
    public static void statx_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.statx_flags$VH.set(seg, x);
    }
    public static int statx_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.statx_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void statx_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.statx_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fadvise_advice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("fadvise_advice"));
    public static VarHandle fadvise_advice$VH() {
        return io_uring_sqe.fadvise_advice$VH;
    }
    public static int fadvise_advice$get(MemorySegment seg) {
        return (int)io_uring_sqe.fadvise_advice$VH.get(seg);
    }
    public static void fadvise_advice$set( MemorySegment seg, int x) {
        io_uring_sqe.fadvise_advice$VH.set(seg, x);
    }
    public static int fadvise_advice$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.fadvise_advice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fadvise_advice$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.fadvise_advice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle splice_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("splice_flags"));
    public static VarHandle splice_flags$VH() {
        return io_uring_sqe.splice_flags$VH;
    }
    public static int splice_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.splice_flags$VH.get(seg);
    }
    public static void splice_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.splice_flags$VH.set(seg, x);
    }
    public static int splice_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.splice_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void splice_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.splice_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rename_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("rename_flags"));
    public static VarHandle rename_flags$VH() {
        return io_uring_sqe.rename_flags$VH;
    }
    public static int rename_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.rename_flags$VH.get(seg);
    }
    public static void rename_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.rename_flags$VH.set(seg, x);
    }
    public static int rename_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.rename_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rename_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.rename_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unlink_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("unlink_flags"));
    public static VarHandle unlink_flags$VH() {
        return io_uring_sqe.unlink_flags$VH;
    }
    public static int unlink_flags$get(MemorySegment seg) {
        return (int)io_uring_sqe.unlink_flags$VH.get(seg);
    }
    public static void unlink_flags$set( MemorySegment seg, int x) {
        io_uring_sqe.unlink_flags$VH.set(seg, x);
    }
    public static int unlink_flags$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.unlink_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unlink_flags$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.unlink_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data"));
    public static VarHandle user_data$VH() {
        return io_uring_sqe.user_data$VH;
    }
    public static long user_data$get(MemorySegment seg) {
        return (long)io_uring_sqe.user_data$VH.get(seg);
    }
    public static void user_data$set( MemorySegment seg, long x) {
        io_uring_sqe.user_data$VH.set(seg, x);
    }
    public static long user_data$get(MemorySegment seg, long index) {
        return (long)io_uring_sqe.user_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, long x) {
        io_uring_sqe.user_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle buf_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("buf_index"));
    public static VarHandle buf_index$VH() {
        return io_uring_sqe.buf_index$VH;
    }
    public static short buf_index$get(MemorySegment seg) {
        return (short)io_uring_sqe.buf_index$VH.get(seg);
    }
    public static void buf_index$set( MemorySegment seg, short x) {
        io_uring_sqe.buf_index$VH.set(seg, x);
    }
    public static short buf_index$get(MemorySegment seg, long index) {
        return (short)io_uring_sqe.buf_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_index$set(MemorySegment seg, long index, short x) {
        io_uring_sqe.buf_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle buf_group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("buf_group"));
    public static VarHandle buf_group$VH() {
        return io_uring_sqe.buf_group$VH;
    }
    public static short buf_group$get(MemorySegment seg) {
        return (short)io_uring_sqe.buf_group$VH.get(seg);
    }
    public static void buf_group$set( MemorySegment seg, short x) {
        io_uring_sqe.buf_group$VH.set(seg, x);
    }
    public static short buf_group$get(MemorySegment seg, long index) {
        return (short)io_uring_sqe.buf_group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_group$set(MemorySegment seg, long index, short x) {
        io_uring_sqe.buf_group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle personality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("personality"));
    public static VarHandle personality$VH() {
        return io_uring_sqe.personality$VH;
    }
    public static short personality$get(MemorySegment seg) {
        return (short)io_uring_sqe.personality$VH.get(seg);
    }
    public static void personality$set( MemorySegment seg, short x) {
        io_uring_sqe.personality$VH.set(seg, x);
    }
    public static short personality$get(MemorySegment seg, long index) {
        return (short)io_uring_sqe.personality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void personality$set(MemorySegment seg, long index, short x) {
        io_uring_sqe.personality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle splice_fd_in$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("splice_fd_in"));
    public static VarHandle splice_fd_in$VH() {
        return io_uring_sqe.splice_fd_in$VH;
    }
    public static int splice_fd_in$get(MemorySegment seg) {
        return (int)io_uring_sqe.splice_fd_in$VH.get(seg);
    }
    public static void splice_fd_in$set( MemorySegment seg, int x) {
        io_uring_sqe.splice_fd_in$VH.set(seg, x);
    }
    public static int splice_fd_in$get(MemorySegment seg, long index) {
        return (int)io_uring_sqe.splice_fd_in$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void splice_fd_in$set(MemorySegment seg, long index, int x) {
        io_uring_sqe.splice_fd_in$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __pad2$slice(MemorySegment seg) {
        return seg.asSlice(40, 24);
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



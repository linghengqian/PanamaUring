// Generated by jextract

package top.dreamlike.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor io_uring_prep_madvise$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_madvise$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_madvise",
        constants$33.io_uring_prep_madvise$FUNC
    );
    static final FunctionDescriptor io_uring_prep_send$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_send$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_send",
        constants$33.io_uring_prep_send$FUNC
    );
    static final FunctionDescriptor io_uring_prep_recv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_recv$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_recv",
        constants$33.io_uring_prep_recv$FUNC
    );
    static final FunctionDescriptor io_uring_prep_openat2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_openat2$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_openat2",
        constants$33.io_uring_prep_openat2$FUNC
    );
    static final FunctionDescriptor io_uring_prep_epoll_ctl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_epoll_ctl$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_epoll_ctl",
        constants$33.io_uring_prep_epoll_ctl$FUNC
    );
    static final FunctionDescriptor io_uring_prep_provide_buffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_provide_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_provide_buffers",
        constants$33.io_uring_prep_provide_buffers$FUNC
    );
}



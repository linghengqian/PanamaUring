// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$33 {

    static final FunctionDescriptor io_uring_prep_fadvise$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_fadvise$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fadvise",
        constants$33.io_uring_prep_fadvise$FUNC
    );
    static final FunctionDescriptor io_uring_prep_madvise$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_madvise$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_madvise",
        constants$33.io_uring_prep_madvise$FUNC
    );
    static final FunctionDescriptor io_uring_prep_send$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_send$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_send",
        constants$33.io_uring_prep_send$FUNC
    );
    static final FunctionDescriptor io_uring_prep_recv$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_recv$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_recv",
        constants$33.io_uring_prep_recv$FUNC
    );
    static final FunctionDescriptor io_uring_prep_openat2$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_openat2$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_openat2",
        constants$33.io_uring_prep_openat2$FUNC
    );
    static final FunctionDescriptor io_uring_prep_epoll_ctl$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_epoll_ctl$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_epoll_ctl",
        constants$33.io_uring_prep_epoll_ctl$FUNC
    );
}



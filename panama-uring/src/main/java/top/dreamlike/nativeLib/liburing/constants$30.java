// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$30 {

    static final FunctionDescriptor io_uring_prep_poll_add$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_poll_add$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_poll_add",
        constants$30.io_uring_prep_poll_add$FUNC
    );
    static final FunctionDescriptor io_uring_prep_poll_remove$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_poll_remove$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_poll_remove",
        constants$30.io_uring_prep_poll_remove$FUNC
    );
    static final FunctionDescriptor io_uring_prep_fsync$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_fsync$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fsync",
        constants$30.io_uring_prep_fsync$FUNC
    );
    static final FunctionDescriptor io_uring_prep_nop$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_nop$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_nop",
        constants$30.io_uring_prep_nop$FUNC
    );
    static final FunctionDescriptor io_uring_prep_timeout$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_timeout$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_timeout",
        constants$30.io_uring_prep_timeout$FUNC
    );
    static final FunctionDescriptor io_uring_prep_timeout_remove$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_timeout_remove$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_timeout_remove",
        constants$30.io_uring_prep_timeout_remove$FUNC
    );
}



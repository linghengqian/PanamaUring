// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$34 {

    static final FunctionDescriptor io_uring_prep_provide_buffers$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_provide_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_provide_buffers",
        constants$34.io_uring_prep_provide_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_prep_remove_buffers$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_remove_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_remove_buffers",
        constants$34.io_uring_prep_remove_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_prep_shutdown$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_shutdown$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_shutdown",
        constants$34.io_uring_prep_shutdown$FUNC
    );
    static final FunctionDescriptor io_uring_prep_unlinkat$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_unlinkat$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_unlinkat",
        constants$34.io_uring_prep_unlinkat$FUNC
    );
    static final FunctionDescriptor io_uring_prep_renameat$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_renameat$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_renameat",
        constants$34.io_uring_prep_renameat$FUNC
    );
    static final FunctionDescriptor io_uring_prep_sync_file_range$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_sync_file_range$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_sync_file_range",
        constants$34.io_uring_prep_sync_file_range$FUNC
    );
}



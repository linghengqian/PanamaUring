// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$26 {

    static final FunctionDescriptor io_uring_register_eventfd$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_eventfd$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_eventfd",
        constants$26.io_uring_register_eventfd$FUNC
    );
    static final FunctionDescriptor io_uring_register_eventfd_async$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_eventfd_async$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_eventfd_async",
        constants$26.io_uring_register_eventfd_async$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_eventfd$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_unregister_eventfd$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_eventfd",
        constants$26.io_uring_unregister_eventfd$FUNC
    );
    static final FunctionDescriptor io_uring_register_probe$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_probe$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_probe",
        constants$26.io_uring_register_probe$FUNC
    );
    static final FunctionDescriptor io_uring_register_personality$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_register_personality$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_personality",
        constants$26.io_uring_register_personality$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_personality$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_unregister_personality$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_personality",
        constants$26.io_uring_unregister_personality$FUNC
    );
}



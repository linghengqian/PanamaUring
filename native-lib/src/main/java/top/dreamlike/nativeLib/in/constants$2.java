// Generated by jextract

package top.dreamlike.nativeLib.in;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$2 {

    static final FunctionDescriptor socketpair$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle socketpair$MH = RuntimeHelper.downcallHandle(
        "socketpair",
        constants$2.socketpair$FUNC
    );
    static final FunctionDescriptor bind$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle bind$MH = RuntimeHelper.downcallHandle(
        "bind",
        constants$2.bind$FUNC
    );
    static final FunctionDescriptor getsockname$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle getsockname$MH = RuntimeHelper.downcallHandle(
        "getsockname",
        constants$2.getsockname$FUNC
    );
    static final FunctionDescriptor connect$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle connect$MH = RuntimeHelper.downcallHandle(
        "connect",
        constants$2.connect$FUNC
    );
    static final FunctionDescriptor getpeername$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle getpeername$MH = RuntimeHelper.downcallHandle(
        "getpeername",
        constants$2.getpeername$FUNC
    );
    static final FunctionDescriptor send$FUNC = FunctionDescriptor.of(CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle send$MH = RuntimeHelper.downcallHandle(
        "send",
        constants$2.send$FUNC
    );
}



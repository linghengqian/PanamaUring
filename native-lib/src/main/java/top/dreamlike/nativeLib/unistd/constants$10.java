// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$10 {

    static final FunctionDescriptor ttyname$FUNC = FunctionDescriptor.of(CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle ttyname$MH = RuntimeHelper.downcallHandle(
        "ttyname",
        constants$10.ttyname$FUNC
    );
    static final FunctionDescriptor ttyname_r$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ttyname_r$MH = RuntimeHelper.downcallHandle(
        "ttyname_r",
        constants$10.ttyname_r$FUNC
    );
    static final FunctionDescriptor isatty$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle isatty$MH = RuntimeHelper.downcallHandle(
        "isatty",
        constants$10.isatty$FUNC
    );
    static final FunctionDescriptor ttyslot$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle ttyslot$MH = RuntimeHelper.downcallHandle(
        "ttyslot",
        constants$10.ttyslot$FUNC
    );
    static final FunctionDescriptor link$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle link$MH = RuntimeHelper.downcallHandle(
        "link",
        constants$10.link$FUNC
    );
    static final FunctionDescriptor linkat$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle linkat$MH = RuntimeHelper.downcallHandle(
        "linkat",
        constants$10.linkat$FUNC
    );
}



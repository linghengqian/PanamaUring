// Generated by jextract

package top.dreamlike.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor readv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle readv$MH = RuntimeHelper.downcallHandle(
        "readv",
        constants$3.readv$FUNC
    );
    static final FunctionDescriptor writev$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle writev$MH = RuntimeHelper.downcallHandle(
        "writev",
        constants$3.writev$FUNC
    );
    static final FunctionDescriptor stat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle stat$MH = RuntimeHelper.downcallHandle(
        "stat",
        constants$3.stat$FUNC
    );
    static final FunctionDescriptor fstat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fstat$MH = RuntimeHelper.downcallHandle(
        "fstat",
        constants$3.fstat$FUNC
    );
    static final FunctionDescriptor lstat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstat$MH = RuntimeHelper.downcallHandle(
        "lstat",
        constants$3.lstat$FUNC
    );
    static final FunctionDescriptor chmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle chmod$MH = RuntimeHelper.downcallHandle(
        "chmod",
        constants$3.chmod$FUNC
    );
}


